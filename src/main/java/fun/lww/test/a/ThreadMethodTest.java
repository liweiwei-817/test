package fun.lww.test.a;

public class ThreadMethodTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        t.setName("main li");

        System.out.println(t.toString());
        System.out.println(t.getPriority());

        Thread t1 = new Thread(() -> {
            System.out.println("00000000000000000");
        });
        t1.start();
        t1.join();

        System.out.println("end");
    }
}
