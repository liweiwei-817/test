package fun.lww.test.a;

public class SingleA {

    private static SingleA a;

    private static Object obj = new Object();

    public static SingleA getInstance() {
        if (a == null) {
            synchronized (obj) {
                if (a == null) {
                    a = new SingleA();
                }
            }
        }
        return a;
    }
}
