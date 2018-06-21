package fun.lww.test;

public class E {

    int sum(int[] a, int n) {
       return n == 0 ? 0 : sum(a, n-1)+a[n-1];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(new E().sum(a, a.length));
    }
}
