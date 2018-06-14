package fun.lww.test.a;

public class ThreadTest {

    public static void main(String[] args) {
        TT tt = new TT();
        Thread t1 = new Thread(tt, "窗口1");
        Thread t2 = new Thread(tt, "窗口2");
        Thread t3 = new Thread(tt, "窗口3");
        t1.start();
        t2.start();
        t3.start();

    }


}
class TT implements Runnable{

    private static int i = 200;

    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                synchronized (TT.class) {
                    if (i > 0) {

                        System.out.println(Thread.currentThread().getName() + "---卖出" + i);
                        i--;
                       /* try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }*/
                    }
                }
            } else {
                //m();
                //n();
                o();
            }
        }
    }

    public void m() {
        synchronized (this) {
            if (i > 0) {

                System.out.println(Thread.currentThread().getName() + "---卖出" + i);
                i--;
                /*try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        }
    }

    public synchronized void n() {
        if (i > 0) {
            System.out.println(Thread.currentThread().getName() + "---卖出" + i);
            i--;
            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public synchronized static void o() {
        if (i > 0) {
            System.out.println(Thread.currentThread().getName() + "---卖出" + i);
            i--;
        }
    }
}