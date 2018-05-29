package fun.lww.test.serialize;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;

    private transient int age;

    private long phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
