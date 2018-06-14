package fun.lww.test.a;

import java.util.*;

public class C {

    public static void main(String[] args) {

        String[] str = new String[]{"name", "age", "phone"};

        List list = Arrays.asList(str);

        Set<String> set = new HashSet<String>(Arrays.asList(str));

        str = (String[]) list.toArray();

        list = new ArrayList(set);

        System.out.println(str.toString());
        System.out.println(list);
        System.out.println(set);

        System.out.println("-----------------");

        list.stream().filter(s -> {
            System.out.println(s.hashCode());
            return s.equals("name");
        }).limit(2).forEach(System.out::println);


    }
}
