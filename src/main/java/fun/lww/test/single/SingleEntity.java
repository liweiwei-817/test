package fun.lww.test.single;

public class SingleEntity {

    private static SingleEntity a;

    private static Object obj = new Object();

    public static SingleEntity getInstance() {
        if (a == null) {
            synchronized (obj) {
                if (a == null) {
                    a = new SingleEntity();
                }
            }
        }
        return a;
    }
}
