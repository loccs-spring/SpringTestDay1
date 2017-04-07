package cn.edu.sjtu.property;

/**
 * Created by spring on 2017/3/27.
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Person..." + this.name);
    }
}
