package fun.lww.test.a;

public class SingleATest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new D());
        Thread t2 = new Thread(new D());
        Thread t3 = new Thread(new D());
        Thread t4 = new Thread(new D());
        Thread t5 = new Thread(new D());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
