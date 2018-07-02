package fun.lww.test.single;

public class SingleEntity {

    volatile private static SingleEntity a = null;

    public SingleEntity() {}

    public static SingleEntity getInstance() {
        if (a == null) {
            synchronized (SingleEntity.class) {
                if (a == null) {
                    a = new SingleEntity();
                }
            }
        }
        return a;
    }

    public synchronized static SingleEntity getInstance1() {
        if (a == null) {
            a = new SingleEntity();
        }
        return a;
    }

}
