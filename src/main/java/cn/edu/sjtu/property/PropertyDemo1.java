package cn.edu.sjtu.property;

/**
 * Created by spring on 2017/3/27.
 */
public class PropertyDemo1 {
    private String userName;

    public PropertyDemo1(String userName) {
        this.userName = userName;
    }

    public void test1 () {
        System.out.println("test1 " + this.userName);
    }
}


