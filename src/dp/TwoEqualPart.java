package dp;

import java.util.Arrays;

public class TwoEqualPart {
    public static void main(String[] args) {
        new TwoEqualPart();
    }

    public TwoEqualPart() {
        int[] a = {1,2,3,4};
        int[] s = new int[a.length];
        per(a, s, 0);
    }
    boolean e(int[] a, int from, int sum) {
        return false;
    }

    void per(int[] a, int[] s, int cur) {
        if (cur == a.length) {
            for (int i = 0; i < s.length; i++) {
                System.out.print(a[s[i]]+",");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if(notIn(s, i, cur)) {
                s[cur] = i;
                per(a, s, cur+1);
            }
        }
    }

    private boolean notIn(int[] s, int e, int cur) {
        for (int i = 0; i < cur; i++) {
            if (s[i] == e) {
                return false;
            }
        }
        return true;
    }
}
