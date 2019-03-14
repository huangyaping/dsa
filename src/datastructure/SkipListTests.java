package datastructure;

import java.util.*;

public class SkipListTests {
    public static void main(String[] args) {
        SkipList skipList = new SkipList(16);
        int[] a = {7, 9, 3, 5, 21, 15};
        for (int i = 0; i < a.length; i++) {
            System.out.println(new Random().nextInt(16));
            skipList.add(new SkipListVal(a[i]));
        }
        skipList.remove(new SkipListVal(a[new Random().nextInt(a.length)]));
        System.out.println(skipList.header.toString(0));
    }
}
class SkipList {
    final SkipListNode header;
    final int level;
    int size;
    Map<SkipListVal, SkipListNode> map;

    SkipList(int level) {
        this.level = level;
        header = new SkipListNode( null, level);
        size = 0;
        map = new HashMap<>();
    }

    SkipListNode[] range(SkipListVal from, SkipListVal to) {
        return new SkipListNode[]{};
    }

    SkipListNode add(SkipListVal xval) {
        SkipListNode[] update = new SkipListNode[this.level];
        SkipListNode cur = this.header;
        for (int curLevel = this.level-1; curLevel >= 0; curLevel--) {
            while (cur.forwards[curLevel] != null && cur.forwards[curLevel].val.compareTo(xval) < 0) {
                cur = cur.forwards[curLevel];
            }
            update[curLevel] = cur;
        }
        int newLevel = new Random().nextInt(this.level);
        SkipListNode newNode = new SkipListNode(xval, newLevel+1);
        for (int ilevel = newLevel; ilevel >= 0; ilevel--) {
            newNode.forwards[ilevel] = update[ilevel].forwards[ilevel];
            update[ilevel].forwards[ilevel] = newNode;
        }
        size++;
        map.put(xval, newNode);
        return newNode;
    }

    boolean remove(SkipListVal xval) {
        SkipListNode node = map.remove(xval);
        SkipListNode[] update = new SkipListNode[node.forwards.length];
        SkipListNode curNode = this.header;
        for (int curLevel = this.level-1; curLevel >= 0; curLevel--) {
            while (curNode.forwards[curLevel] != null) {
                int compareTo = curNode.forwards[curLevel].val.compareTo(xval);
                if(compareTo < 0) {
                    curNode = curNode.forwards[curLevel];
                } else {
                    if (compareTo == 0) {
                        update[curLevel] = curNode;
                    }
                    break;
                }
            }
        }
        for (int ilevel = update.length-1; ilevel >= 0; ilevel--) {
            update[ilevel].forwards[ilevel] = node.forwards[ilevel];
            node.forwards[ilevel] = null;
        }
        size--;
        return true;
    }
}

class SkipListNode {
    SkipListVal val;
    SkipListNode[] forwards;
    SkipListNode(SkipListVal val, int level) {
        this.val = val;
        this.forwards = new SkipListNode[level];
    }

    @Override
    public String toString() {
        return "{" + "val=" + val + ", f("+forwards.length+")=" + Arrays.toString(forwards) + '}';
    }

    public String toString(int level) {
        //return "{" + "val=" + val + ", f("+forwards.length+")=" + Arrays.toString(forwards) + '}';
        StringBuilder sb = new StringBuilder();
        sb.append("{" + "val=" + val + ", f(" + forwards.length + ")=");
        if (forwards[level] != null) {
            sb.append(forwards[level].toString(level));
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
    }

    private String len(SkipListNode[] forwards) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < forwards.length; i++) {
            sb.append(len(forwards[i])+",");
        }
        return sb.toString();
    }

    private int len(SkipListNode node) {
        if (node == null) {
            return 0;
        }
        return node.forwards.length;
    }
}

class SkipListVal implements Comparable<SkipListVal> {
    Comparable val;
    public SkipListVal(Comparable val) {
        this.val = val;
    }
    @Override
    public int compareTo(SkipListVal o) {
        return val.compareTo(o.val);
    }

    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkipListVal that = (SkipListVal) o;

        return val != null ? val.equals(that.val) : that.val == null;
    }

    @Override
    public int hashCode() {
        return val != null ? val.hashCode() : 0;
    }
}

class SkipListScore implements Comparable<SkipListScore> {
    Comparable val;
    public SkipListScore(Comparable val) {
        this.val = val;
    }
    @Override
    public int compareTo(SkipListScore o) {
        return val.compareTo(o.val);
    }
}

class SkipListKey {
    Object key;

    public SkipListKey(Object key) {
        this.key = key;
    }
}