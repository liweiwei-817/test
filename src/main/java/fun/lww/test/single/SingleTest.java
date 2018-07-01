package fun.lww.test.single;

public class SingleTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Out());
        Thread t2 = new Thread(new Out());
        Thread t3 = new Thread(new Out());
        Thread t4 = new Thread(new Out());
        Thread t5 = new Thread(new Out());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
