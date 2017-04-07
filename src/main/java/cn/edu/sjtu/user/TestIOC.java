package cn.edu.sjtu.user;

import cn.edu.sjtu.property.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by spring on 2017/3/27.
 */


public class TestIOC {
    @Test
    public void testUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
    @Test
    public void testAddress() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Address address = (Address) context.getBean("addressList");
        System.out.println(address);
        //address.test();
    }
    @Test
    public void testPerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        person.test();
    }


    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        book.demoName();
    }

    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        user1.add();

    }

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println(bean2);
        bean2.add();
    }

    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3) context.getBean("bean3");
        System.out.println(bean3);
        bean3.add();
    }

    @Test
    public void testProperty1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertyDemo1 demo1 = (PropertyDemo1) context.getBean("demo1");
        System.out.println(demo1);
        demo1.test1();
    }


}
