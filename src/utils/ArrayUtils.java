package utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {
    public static int[] randomInts(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            int ri = new Random().nextInt(200);
            a[i] = ri;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomInts(50)));
    }
}
