package fun.lww.test.a;

import java.util.Arrays;

public class 冒泡 {

    public static void efferArray1(int[] in ) {
        int tem = 0;
        int num = 0;
        int upnum = 0;
        for (int i = 0; i < in .length; i++) {
            for (int j = i; j < in .length - 1; j++) {
                num++;
                if ( in [j + 1] < in [i]) {
                    tem = in [j + 1];
                    in [j + 1] = in [i];
                    in [i] = tem;
                    upnum++;
                }
            }
        }
        for (int i = 0; i < in .length; i++) {
            System.out.print( in [i]);
            if (i < in .length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("冒泡排序循环次数:" + num);
        System.out.println("移动次数：" + upnum);
        System.out.print("\n\n\n");
    }

    public static void efferArray2(int[] in) {
        int num = 0;
        int upnum = 0;

        for (int i=0; i< in.length-1; i++) {
            for (int j=0; j<in.length-i-1; j++) {
                num++;
                if (in[j] > in[j+1]) {
                    int x = in[j];
                    in[j] = in[j+1];
                    in[j+1] = x;
                    upnum++;
                }
            }
        }
        for (int i = 0; i < in .length; i++) {
            System.out.print( in [i]);
            if (i < in .length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("冒泡排序循环次数:" + num);
        System.out.println("移动次数：" + upnum);
        System.out.print("\n\n\n");
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 32, 123, 12, 23, 34, 4};
        int[] arr2 = {1, 2, 32, 123, 12, 23, 34, 4};

        efferArray1(arr1);
        System.out.println("--------------------");
        efferArray2(arr2);


    }
}
