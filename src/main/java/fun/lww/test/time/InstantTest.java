package fun.lww.test.time;

import java.time.Duration;
import java.time.Instant;

/**
 * java.time.Instant 类使用在机器可读的时间格式上的 以unix时间戳形式存储时间
 */
public class InstantTest {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        Instant specificTime = Instant.ofEpochMilli(instant.toEpochMilli());
        System.out.println(specificTime);

        Duration duration = Duration.ofDays(30);
        System.out.println(duration);
    }

}
