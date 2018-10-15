package dp;

import java.util.Arrays;
import java.util.Random;

public class ContinuousSum {

    public static void main(String[] args) {
        ContinuousSum cs = new ContinuousSum();
        for (int i = 0; i < 100; i++) {
            cs.csum();
        }
    }

    public ContinuousSum() {
    }

    private void csum() {
        //int[] a = {7, 22, 62, 18, -15, -77, 11, 0, 65, -13};
        int size = 10;
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            int nextInt = new Random().nextInt(200);
            nextInt -= 100;
            a[i] = nextInt;
        }
        int csum = csum(a);
        int csumS = csumS(a);
        if (csum != csumS) {
            System.out.println(csum+","+csumS+","+Arrays.toString(a));
        }
    }

    int csum(int[] a) {
        int i = 0;
        int sum = a[i];
        int max = sum;
        for (i=1; i < a.length; i++) {
            if(sum >= 0) {
                sum += a[i];
            } else {
                sum = a[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
    int csumS(int[] a) {
        int[] s = new int[a.length+1];
        s[0] = 0;
        for (int i = 1; i < a.length+1; i++) {
            s[i] = s[i-1] + a[i-1];
        }
        int max = s[1];
        for (int i = 1; i < a.length+1; i++) {
            for (int j = i; j < a.length+1; j++) {
                if((s[j] - s[i-1])>max) {
                    max = s[j] - s[i-1];
                }
            }
        }
        return max;
    }
}
