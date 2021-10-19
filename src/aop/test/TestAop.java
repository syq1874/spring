package aop.test;

import aop.config.ConfigAop;
import aop.demo1.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
