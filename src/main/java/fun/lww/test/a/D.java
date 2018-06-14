package fun.lww.test.a;

public class D implements Runnable {
    @Override
    public void run() {
        System.out.println(SingleA.getInstance().hashCode());
    }
}
