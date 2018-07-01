package fun.lww.test.clone;

import java.io.*;

/**
 * Java 克隆对象两种方式
 * 1. 实现Cloneable接口 重写clone方法
 * 2. 实现Seriailzable接口 对象通过序列化 反序列化实现克隆 可以实现深度克隆
 *
 *
 * 这里展示第二种
 */
public class Util {

    public static  <T extends Serializable> T clone(T obj) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (T) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
