package fun.lww.test.a;

public class SiSuoTest {

    public static void main(String[] args) throws InterruptedException {

        SiSuo siSuo = new SiSuo();
        Thread t1 = new Thread(siSuo);
        Thread t2 = new Thread(siSuo);
        t1.start();
        Thread.sleep(1);
        siSuo.flag = false;
        t2.start();
    }
}
