package sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        new QuickSort();
    }

    public QuickSort() {
        int size = 1000;
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            int nextInt = new Random().nextInt(1000);
            a[i] = nextInt;
            b[i] = nextInt;
        }
        qsort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b).equals(Arrays.toString(a)));
    }
    void qsort(int[] a, int s, int e) {
        if (s >= e) {
            return;
        }
        int p = partition(a, s, e);
        qsort(a, s, p-1);
        qsort(a, p+1, e);
    }

    private int partition(int[] a, int s, int e) {
        int i = s+1;
        int p = s;
        while (i <= e) {
            if (p < i) {
                if (a[p] > a[i]) {
                    swap(a, p, i);
                    int t = p;
                    p = i;
                    i = t+1;
                } else {
                    i++;
                }
            } else if (p > i) {
                if (a[p] < a[i]) {
                    swap(a, p, i);
                    int t = p;
                    p = i;
                    i = t+1;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return p;
    }

    private void swap(int[] a, int p, int i) {
        int t = a[p];
        a[p] = a[i];
        a[i] = t;
    }
}
