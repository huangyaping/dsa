package list;

import datastructure.SinglyListNode;

public class ReverseSinglyList {

    public static SinglyListNode reverse(SinglyListNode root) {
        SinglyListNode tail = null;
        SinglyListNode cur = root;
        while (cur != null) {
            SinglyListNode tmp = cur.next;
            cur.next = tail;
            tail = cur;
            cur = tmp;
        }
        return tail;
    }

    public void reversePrint(SinglyListNode node) {
        if (node == null) {
            return;
        }
        reversePrint(node.next);
        System.out.println(node.val);
    }

    public SinglyListNode reverse(SinglyListNode pre, SinglyListNode cur) {
        if (cur == null) {
            return pre;
        }
        SinglyListNode tail = reverse(cur, cur.next);
        cur.next = pre;
        return tail;
    }

    public ReverseSinglyList() {
        SinglyListNode root = new SinglyListNode(1, new SinglyListNode(2, new SinglyListNode(3, null)));
        SinglyListNode tail = reverse(root);
        tail.printEach();
        root = reverse(tail);
        root.printEach();

        reversePrint(root);

        tail = reverse(null, root);
        tail.printEach();

        tail = reverse(null, tail);
        tail.printEach();

    }
    public static void main(String[] args) {
        new ReverseSinglyList();
    }
}
