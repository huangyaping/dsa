package array.sorted;

public class Duplicate {
    public static void main(String[] args) {
        new Duplicate();
    }

    public Duplicate() {
        lastDuplicate();
    }

    // Find last index of an element in a sorted array with duplicates
    private void lastDuplicate() {
        int[] a = new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8};
        //a = new int[]{0, 1, 2, 2, 4, 5, 5, 5, 8};
        int num = 5;
        System.out.println(lastIndexDuplicate(a, num));
    }

    private int lastIndexDuplicate(int[] a, int num) {
        return binarySearch(a, 0, a.length - 1, num);
    }

    private int binarySearch(int[] a, int s, int e, int num) {
        if (s > e) {
            return -1;
        }
        int mid = (e + s) / 2;
        if (a[mid] > num) {
            return binarySearch(a, s, mid - 1, num);
        } else if (a[mid] < num) {
            return binarySearch(a, mid + 1, e, num);
        } else {
            if (a[mid + 1] == num) {
                return binarySearch(a, mid + 1, e, num);
            } else {
                return mid;
            }
        }
    }
}
