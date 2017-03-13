package jianye.ood.chapter10;

/**
 * Created by jianye on 3/12/17.
 */

public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this(name, -1);
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " +  name + " with age: " + String.valueOf(age);
    }
}
