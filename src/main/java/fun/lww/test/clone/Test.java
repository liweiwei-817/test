package fun.lww.test.clone;

import java.io.Serializable;

public class Test implements Serializable {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setId(123);
        test.setName("123");
        System.out.println(test.toString());
        System.out.println(test.hashCode());

        Test test1 = Util.clone(test);
        System.out.println(test1.toString());
        System.out.println(test1.hashCode());
    }
}
