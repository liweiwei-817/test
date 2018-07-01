package fun.lww.test.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G {

    public static void main(String[] args) {

        String str = "as sd   \t sdf sdf";
        Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll(""));

    }
}
