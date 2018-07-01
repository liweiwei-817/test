package fun.lww.test.算法;

import java.util.Arrays;

public class 二分法 {

    public static int binarySearch(int[] i, int a) {
        int start = 0;
        int end = i.length-1;

        while (start <= end) {
            int mid = (start+end) >>> 1;
            if (a > i[mid]) {
                start = mid + 1;
            } else if (a < i[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] i = {1, 2, 32, 123, 34, 12, 23, 34, 4};
        Arrays.sort(i);
        int a = 12;

        System.out.println(binarySearch(i, a));

        //System.out.println(Arrays.binarySearch(i, a));
    }
}
