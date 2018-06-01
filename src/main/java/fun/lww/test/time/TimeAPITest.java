package fun.lww.test.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

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


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //2018-05-31 21:11
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 5, 31, 21, 10);
        System.out.println(localDateTime1);

        //2018-05-31 21:11:00 11
        LocalDateTime localDateTime2 = LocalDateTime.of(2018, 5, 31, 21, 11, 0, 11);
        System.out.println(localDateTime2);

        //使用瞬时时间 + 时区
        LocalDateTime localDateTime3 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = LocalDateTime.parse("2018-05-31T21:11");
        System.out.println(localDateTime4);

        LocalDateTime localDateTime5 = LocalDateTime.parse("2018-05-31T21:11:00.11");
        System.out.println(localDateTime5);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String str = localDateTime5.format(dateTimeFormatter);
        System.out.println(str);


        //两个瞬时时间的时间段
        Duration duration = Duration.between(Instant.ofEpochMilli(System.currentTimeMillis()-11111), Instant.now());
        System.out.println(duration.toMillis());


    }

}
