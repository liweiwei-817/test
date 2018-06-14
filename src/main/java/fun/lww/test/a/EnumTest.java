package fun.lww.test.a;

public enum EnumTest {
    A(1, "A"),
    B(2, "B");

    private int i;
    private String s;

    EnumTest(int a, String b) {
        this.i = a;
        this.s = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
