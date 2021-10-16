package demo2.d1016.test;

import demo2.d1016.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testCollection(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("demo2/d1016/bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }
}
