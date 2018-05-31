package fun.lww.test.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

/**
 * java.time API 测试
 */
public class TimeAPITest {

    public static void main(String[] args) {

        //时钟提供给我们访问某个特定的 时区的 瞬间时间 日期 和 时间点
        //系统默认UTC时钟
        Clock clock = Clock.systemUTC();
        //返回当前瞬时时间
        System.out.println(clock.millis());

        //系统默认时区时钟 当前瞬时时间
        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1.millis());

        //巴黎时区
        Clock clock2 = Clock.system(ZoneId.of("Europe/Paris"));
        System.out.println(clock2.millis());

        //上海时区
        Clock clock3 = Clock.system(ZoneId.of("Asia/Shanghai"));
        System.out.println(clock3.millis());

        //固定上海时区时钟
        Clock clock4 = Clock.fixed(Instant.now(), ZoneId.of("Asia/Shanghai"));
        System.out.println(clock4.millis());

        //相对于系统默认时钟两秒的时钟
        Clock clock5 = Clock.offset(clock, Duration.ofSeconds(2));
        System.out.println(clock5.millis());


        Instant instant = Instant.now();
        //精确到秒 相对于1970-01-01 00:00:00的时间
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());



    }

}
