package list;

import datastructure.SinglyListNode;

public class SinglyListAdder {
    public static void main(String[] args) {
        new SinglyListAdder();
    }
    public SinglyListAdder() {
//        SinglyListNode a = new SinglyListNode(9, new SinglyListNode(8, new SinglyListNode(9, new SinglyListNode(7, new SinglyListNode(6, null)))));
//        SinglyListNode b = new SinglyListNode(1, new SinglyListNode(9, new SinglyListNode(8, null)));
        SinglyListNode a = new SinglyListNode(9, new SinglyListNode(9, new SinglyListNode(9, null)));
        SinglyListNode b = new SinglyListNode(1, null);
//        SinglyListNode a = new SinglyListNode(9, null);
//        SinglyListNode b = new SinglyListNode(1, null);
        SinglyListNode sum = addaa(a, b);
        sum = ReverseSinglyList.reverse(sum);
        sum.printEach();
    }

    private SinglyListNode addaa(SinglyListNode a, SinglyListNode b) {
        SinglyListNode<Integer> ca = ReverseSinglyList.reverse(a);
        SinglyListNode<Integer> cb = ReverseSinglyList.reverse(b);
        SinglyListNode<Integer> cca = ca;
        SinglyListNode<Integer> ccb = cb;
        SinglyListNode result = null;
        SinglyListNode sum = null;
        while (cca != null && ccb != null) {
            cca = cca.next;
            ccb = ccb.next;
        }
        if (cca == null) {
            sum = cb;
        } else {
            sum = ca;
        }
        result = sum;
        int c = 0;
        while (ca != null || cb != null) {
            int csum = c;
            if (ca != null) {
                csum += ca.val;
                ca = ca.next;
            }
            if (cb != null) {
                csum += cb.val;
                cb = cb.next;
            }
            c = csum / 10;
            csum %= 10;
            sum.val = csum;

            if (sum.next != null) {
                sum = sum.next;
            }
        }
        if (c > 0) {
            sum.next = new SinglyListNode(c, null);
        }
        return result;
    }

    public int reverseAdd(SinglyListNode<Integer> a, SinglyListNode<Integer> b, SinglyListNode<Integer> sum) {
        if (a == null && b == null) {
            return 0;
        }
        SinglyListNode an = a, bn = b;
        if (a.next != null) {
            an = a.next;
        }
        if (b.next != null) {
            bn = b.next;
        }
        int c = reverseAdd(an, bn, sum.next);
        if (a != null) {
            c += a.val;
            a.val = 0;
        }
        if (b != null) {
            c += b.val;
            b.val = 0;
        }
        sum.val = c % 10;
        return c / 10;
    }

}
