package bintree;

public class Traversal {

    public static void main(String[] args) {
        new Traversal();
    }

    public Traversal() {
        char[] preOrder = "DBACEGF".toCharArray();
        char[] inOrder = "ABCDEFG".toCharArray();
        BinNode root = newByOrder(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
        if (root != null) {
            BinNode.preOrder(root);
            BinNode.inOrder(root);
            BinNode.postOrder(root);
        }
    }

    BinNode newByOrder(char[] preOrder, int ps, int pe, char[] inOrder, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        char rootChar = preOrder[ps];
        int inRootIdx = indexInOrder(inOrder, rootChar, is, ie);
        if (inRootIdx == -1) {
            return null;
        }
        BinNode root = new BinNode(rootChar);
        int leftLen = inRootIdx - is;
        root.left = newByOrder(preOrder, ps + 1, pe, inOrder, is, inRootIdx - 1);
        root.right = newByOrder(preOrder, ps + leftLen + 1, pe, inOrder, inRootIdx + 1, ie);
        return root;
    }

    private int indexInOrder(char[] inOrder, char ch, int is, int ie) {
        for (int i = is; i <= ie; i++) {
            if (inOrder[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}

class BinNode {
    char val;
    BinNode left;
    BinNode right;

    public BinNode() {
    }

    public BinNode(char val) {
        this(val, null, null);
    }

    public BinNode(char val, BinNode left, BinNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void postOrder(BinNode binNode) {
        postOrderInternal(binNode);
        System.out.println();
    }
    public static void preOrder(BinNode binNode) {
        preOrderInternal(binNode);
        System.out.println();
    }
    public static void inOrder(BinNode binNode) {
        inOrderInternal(binNode);
        System.out.println();
    }
    public static void postOrderInternal(BinNode binNode) {
        if (binNode == null) {
            return;
        }
        postOrderInternal(binNode.left);
        postOrderInternal(binNode.right);
        System.out.print(binNode.val);
    }
    public static void preOrderInternal(BinNode binNode) {
        if (binNode == null) {
            return;
        }
        System.out.print(binNode.val);
        preOrderInternal(binNode.left);
        preOrderInternal(binNode.right);
    }
    public static void inOrderInternal(BinNode binNode) {
        if (binNode == null) {
            return;
        }
        inOrderInternal(binNode.left);
        System.out.print(binNode.val);
        inOrderInternal(binNode.right);
    }
}
