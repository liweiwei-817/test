package fun.lww.test.single;

public class Out implements Runnable {
    @Override
    public void run() {
        System.out.println(SingleEntity.getInstance().hashCode());
    }
}
