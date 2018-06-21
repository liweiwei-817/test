package fun.lww.test.a;

import java.util.HashMap;
import java.util.Map;

public class F {

    public static void main(String[] args) {

        String s = "asdfasdfasdfasdfsdfsd'asdfdfgsfkajiowjnfinmalsdjif";

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        for (char c1 : c) {
            if (map.containsKey(c1)) {
                map.put(c1, map.get(c1)+1);
            } else {
                map.put(c1, 1);
            }
        }
        System.out.println(map);

    }
}
