package fun.lww.test.a;

import java.util.*;

/**
 * 用面向对象的方法求出数组中重复value的个数
 * 输出如下：
 *  1出现2次
 *  2出现2次
 *  3出现2次
 */
public class B {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 7, 8, 9, 0, 1, 2, 3, 4, 3, 4, 5, 6, 7, 8, 9, 0};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int now = map.get(arr[i])+1;
                map.remove(arr[i]);
                map.put(arr[i], now);
            } else {
                map.put(arr[i], 1);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " 出现 " + v + " 次"));

        long s2 = new String("abc").intern().hashCode();
        long s1 = "abc".hashCode();
        System.out.println(s1);
        System.out.println(s2);
    }

}
