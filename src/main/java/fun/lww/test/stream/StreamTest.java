package fun.lww.test.stream;

import java.util.ArrayList;
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
    }
}
