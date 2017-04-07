package cn.edu.sjtu.property;

/**
 * Created by spring on 2017/3/27.
 */
public class Book {
    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void demoName() {
        System.out.println("book..." + bookName);
    }
}
