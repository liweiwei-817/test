package fun.lww.test.single;

public class SingleTest {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread t1 = new Thread(new Out());
            t1.start();
        }
    }
}
