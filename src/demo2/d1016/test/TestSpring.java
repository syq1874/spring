package demo2.d1016.test;

import demo2.d1016.collectiontype.Book;
import demo2.d1016.collectiontype.Course;
import demo2.d1016.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testCollection1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("demo2/d1016/bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }

    @Test
    public void testCollection2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("demo2/d1016/bean5.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);

    }

    @Test
    public void testCollection3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("demo2/d1016/bean6.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);

    }
}
