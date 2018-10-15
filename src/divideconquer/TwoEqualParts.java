package divideconquer;

import utils.ArrayUtils;

import java.util.Arrays;

public class TwoEqualParts {
    public static void main(String[] args) {
        new TwoEqualParts();
    }

    public TwoEqualParts() {
        //while (te());
        te();
    }

    private boolean te() {
        int size = 80;
        //int[] a = {15, 5, 15, 20, 45};
        int sum = 0;
        int[] a;
        while (true) {
            sum = 0;
            a = ArrayUtils.randomInts(size);
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            if (sum % 2 == 0) {
                break;
            }
        }
        int[] ia = new int[size];
        System.out.println(sum + "," + Arrays.toString(a));
        boolean te = te(a, ia, 0, sum / 2, 0);
        if(te == false) {
        }
        return te;
    }

    boolean te(int[] a, int[] ia, int iai, int reqSum, int cur) {
        if (reqSum == 0) {
            printArrayByIdx(a, ia, iai);
            return true;
        } else if (cur == a.length) {
            return false;
        }
        ia[iai] = cur;
        boolean te1 = te(a, ia, iai+1, reqSum - a[cur], cur + 1);
        if (te1) {
            return true;
        }
        return te(a, ia, iai, reqSum, cur + 1);
    }

    private void printArrayByIdx(int[] a, int[] ia, int size) {
        int psum = 0;
        for (int i = 0; i < size; i++) {
            psum += a[ia[i]];
            //System.out.print(a[ia[i]]+",");
        }
        //System.out.println("psum="+psum);
    }

}
