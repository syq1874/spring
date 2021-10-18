package demo2.d1018.test;

import demo2.d1016.bean.Orders;
import demo2.d1018.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("demo2/d1018/bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }

}
