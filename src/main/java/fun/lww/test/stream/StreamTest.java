package fun.lww.test.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java8 新特性 Stream API
 */
public class StreamTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        list.stream().filter(i -> i < 5).skip(1).forEach(System.out::println);

        System.out.println("-------------");

        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        int i = list.stream().map(a -> a + a).reduce((sum, a) -> sum+a).get();
        System.out.println(i);

        List<String> list2 = list.stream().map(a -> a+"aaa").map(a -> a.toUpperCase()).collect(Collectors.toList());
        list2.forEach(a -> System.out.println(a));

        System.out.println("-------------");
        //去重
        list.stream().distinct().forEach(a -> System.out.println(a));

        //最大值 最小值 总和
        System.out.println(list.stream().mapToInt(a -> a).sum());
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(a -> a).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
