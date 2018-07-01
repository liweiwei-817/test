package fun.lww.test.算法;

import java.util.*;

/**
 * 一副从1到n的牌 每次从牌堆顶去除一张放在桌子上 再取出一张放在牌堆底
 * 直到手机没牌 最后柱子上的牌是从1到n有序 设计输入n 输出牌堆顺序数组
 */
public class InNOutArray {

    public static void test1(int n) {
        //将输入的数值遍历得到1-n数组
        List<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) {
            list.add(i);
        }
        //结果数组
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i=0; i<list.size(); i++) {
            if (i % 2 == 0) {
                list1.add(list.get(i));
            } else {
                list2.add(list.get(i));
            }
        }
        //数组为奇数个时操作
        if (n % 2 == 1) {
            int a = list2.get(0);
            list2.remove(0);
            list2.add(a);
        }
        test2(list1, list2);
        test3(list, list1);
    }

    public static void test2(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new ArrayList<Integer>();
        for (int i=0; i<list2.size(); i++) {
            if (i % 2 == 0) {
                list1.add(list2.get(i));
            } else {
                list3.add(list2.get(i));
            }
        }
        if (list3.size() > 0) {
            if (list2.size() % 2 == 1) {
                int a = list3.get(0);
                list3.remove(0);
                list3.add(a);
            }
            test2(list1, list3);
        }
    }

    /**
     * 首先获取到初始数组1-n的结果集 此时结果集不是有序的 将结果集冒泡排序 排序中对应元素值调整位置
     * @param list 1-n的有序初始数组
     * @param list1 结果集
     */
    public static void test3(List<Integer> list, List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size()-i-1; j++) {
                if (list1.get(j) > list1.get(j+1)) {
                    int a = list1.get(j);
                    int b = list1.get(j+1);
                    list1.set(j, b);
                    list1.set(j+1, a);

                    int x = list.size() + 1;
                    int y = list.size() + 1;
                    for (int k = 0; k < list.size(); k++) {
                        if (a == list.get(k)) {
                            x = k;
                        }
                        if (b == list.get(k)) {
                            y = k;
                        }
                    }
                    int n = list.get(x);
                    list.set(x, list.get(y));
                    list.set(y, n);
                }
            }
        }
        System.out.println("牌堆顺序："+list);
        System.out.println("结果数组："+list1);
    }

    public static void main(String[] args) {
        test1(9);
    }
}
