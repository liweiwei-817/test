package fun.lww.test.a;

public class SiSuo implements Runnable {

    private Object obj1 = new Object();

    private Object obj2 = new Object();

    boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (obj1) {
                    synchronized (obj2) {
                        System.out.println("obj1 obj2");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (obj2) {
                    synchronized (obj1) {
                        System.out.println("obj2 obj1");
                    }
                }
            }
        }

    }
}
