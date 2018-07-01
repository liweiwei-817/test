package fun.lww.test.a;

public class D {

    public long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public long factorial1(long n) {
        return factorial1(n, 1);
    }

    private long factorial1(long n, long accum) {
        if (n == 0) {
            return accum;
        } else {
            return factorial1(n - 1, accum * n);
        }
    }

    public static void main(String[] args) {

        D d = new D();

        long start1 = System.currentTimeMillis();
        System.out.println(d.factorial(20));
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        System.out.println(d.factorial1(20));
        System.out.println(System.currentTimeMillis() - start2);
    }
}
