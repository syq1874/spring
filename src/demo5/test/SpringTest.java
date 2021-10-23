package demo5.test;

import demo5.entity.User;
import demo5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringTest {

    @Test
    public void testAdd(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user =new User();
        user.setUsername("admin");
        user.setUstatus("b");
        userService.addUser(user);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user =new User();
        user.setUserId("1");
        user.setUsername("admin");
        user.setUstatus("b");
        userService.updateUser(user);
    }

    @Test
    public void testdelete(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.deleteUser("1");
    }

    @Test
    public void testselect(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int count = userService.selectUser();
        System.out.println(count);
    }

    @Test
    public void testselect1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.findOne("1");
        System.out.println(user);
    }

    @Test
    public void testselect2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> all = userService.findAll();
        System.out.println(all);
    }


    @Test
    public void testBatchAdd(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs =new ArrayList<>();
        Object[] o1={"3","java","a"};
        Object[] o2={"4","C++","b"};
        Object[] o3={"5","MySQL","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchAdd(batchArgs);
    }

    @Test
    public void testBatchUpdate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs =new ArrayList<>();
        Object[] o1={"java","d","3"};
        Object[] o2={"C++","e","4"};
        Object[] o3={"MySQL","f","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchUpdate(batchArgs);
    }

}
