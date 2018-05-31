package fun.lww.test.a;

import java.time.Instant;

/**
 * 如果 a+b+c=1000，且 a^2+b^2=c^2（a,b,c 为自然数），如何求出所有a、b、c可能的组合?
 */
public class A {

    /**
     * 第一种测试
     */
    public void test1() {
        for (int a=0; a<1001; a++) {
            for (int b=0; b<1001; b++) {
                for (int c=0; c<1001; c++) {
                    if ((a+b+c == 1000) && (Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2))) {
                        System.out.println("a=" + a + " b=" + b +" c=" + c);
                    }
                }
            }
        }
    }

    /**
     * 第二种测试
     */
    public void test2() {
        for (int a=0; a<1001; a++) {
            for (int b = 0; b < 1001; b++) {
                int c = 1000 - a - b;
                if (Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println("a=" + a + " b=" + b +" c=" + c);
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("开始时间：" + Instant.now().toEpochMilli());
        //new A().test1();
        new A().test2();
        System.out.println("结束时间：" + Instant.now().toEpochMilli());
    }
}
