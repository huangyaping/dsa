package datastructure;

public class SinglyListNode<T> {

    public T val;
    public SinglyListNode next;

    public SinglyListNode() {
    }

    public SinglyListNode(T val, SinglyListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printEach() {
        SinglyListNode cur = this;
        while (cur != null) {
            System.out.print(cur.val+",");
            cur = cur.next;
        }
        System.out.println();
    }
}
