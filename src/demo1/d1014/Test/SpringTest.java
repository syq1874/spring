package demo1.d1014.Test;

import demo1.d1014.demo1.Order;
import demo1.d1014.demo1.User;
import demo1.d1014.demo1.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testadd(){
        //1.加载spring配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("demo1/bean1.xml");
        //2.获取创建配置的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testbook(){
        //1.加载spring配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("demo1/bean1.xml");
        //2.获取创建配置的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testorders(){
        //1.加载spring配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("demo1/bean1.xml");
        //2.获取创建配置的对象
        Order orders = context.getBean("orders", Order.class);
        System.out.println(orders);
        orders.order();
    }
}
