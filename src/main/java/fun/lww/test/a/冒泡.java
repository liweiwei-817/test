package fun.lww.test.a;

import java.util.Arrays;

public class 冒泡 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 32, 123, 12, 23, 34, 4};

        for (int i=0; i< arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
