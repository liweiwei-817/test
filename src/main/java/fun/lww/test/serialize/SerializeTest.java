package fun.lww.test.serialize;

import java.io.*;

/**
 * Create by lww on 18/4/25
 * 序列化/反序列化 测试
 */
public class SerializeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person();
        person.setName("lww");
        person.setAge(24);
        person.setPhone(17611287817l);

        /*//序列化
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/liweiwei/Desktop/SerializeTest.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        fileOutputStream.close();
        objectOutputStream.close();

        //反序列化
        FileInputStream fileInputStream = new FileInputStream("C:/Users/liweiwei/Desktop/SerializeTest.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p = (Person) objectInputStream.readObject();
        System.out.println(p);
        fileInputStream.close();
        objectInputStream.close();*/

        Person p = Util.clone(person);
        System.out.println(p);
    }
}
