package string;

import java.util.Arrays;

public class KMP {

    public static void main(String[] args) {
        new KMP();
    }

    private KMP() {
        String str = "abcababd";
        String word = "participate in parachute";
        char[] s = str.toCharArray();
        char[] w = word.toCharArray();
        int idx = indexOf(s, w);
        System.out.println(idx);
    }

    private int indexOf(char[] s, char[] w) {
        int[] pmt = pmt(w);
        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(pmt));
        for (int m = 0, i = 0; m+i < s.length;) {
            if (s[m + i] == w[i]) {
                i++;
            } else if (i > 0 && pmt[i - 1] > 0) {
                int step = i - pmt[i - 1];
                m += step;
                i -= step;
            } else {
                m += i;
                if (i == 0) {
                    m++;
                }
                i = 0;
            }
            if (i == w.length) {
                return m;
            }
        }
        return -1;
    }

    int[] pmt(char[] chars) {
        int[] pmt = new int[chars.length];
        for (int si = 1, pi = 0; si < chars.length;) {
            if (chars[si] == chars[pi]) {
                pmt[si] = pi+1;
                pi++;
                si++;
            } else if (pi > 0) {
                pi--;
            } else {
                pi = 0;
                pmt[si] = 0;
                si++;
            }
        }
        return pmt;
    }
}
