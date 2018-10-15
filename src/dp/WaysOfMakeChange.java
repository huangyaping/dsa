package dp;

public class WaysOfMakeChange {
    public static void main(String[] args) {
        new WaysOfMakeChange();
    }

    public WaysOfMakeChange() {
        w();
    }

    private void w() {
        int[] changes = {1, 5, 10, 20};
        int ways = 0, num;
        for (num = 1; num <= 10; num++) {
            System.out.println(num+", "+w(changes, num));
        }
        num = 20;
        System.out.println(num+", "+w(changes, num));
    }

    int w(int[] changes, int num) {
        int[][] w = new int[changes.length+1][num + 1];
        for (int cur = 1; cur <= num; cur++) {
            int sum = 0;
            for (int j = 0; j < changes.length; j++) {
                if(cur < changes[j]) {
                    break;
                }
                sum += w[j][cur - changes[j]];
                sum += w[j + 1][cur];
            }
            w[changes.length-1][cur] = sum;
        }
        return w[changes.length-1][num];
    }

    int wloop(int[] changes, int num) {
        int sum = 0;
        int n = num;
        int ci = 0;
        int i = ci;
        while (i < changes.length) {
            n -= changes[i];
            if (n == 0) {
                sum++;
                i++;
                n += changes[i];
            } else if (n < 0) {
                n += changes[i];
                i++;
            }
        }
        return 0;
    }
    private void wr() {
        int[] changes = {1, 5, 10, 20};
        int ways = 0, num;
        for (num = 1; num <= 10; num++) {
            System.out.println(num+", "+wr(changes, num, 0));
        }
        num = 20;
        System.out.println(num+", "+wr(changes, num, 0));
    }
    int wr(int[] changes, int num, int ci) {
        if (num == 0) {
            return 1;
        } else if (num < 0 || ci == changes.length || num < changes[ci]) {
            return 0;
        }
        int ways = wr(changes, num - changes[ci], ci);
        ways += wr(changes, num, ci+1);
        return ways;
    }
}
