package demo5.test;

import demo5.entity.User;
import demo5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testAdd(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("demo5/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user =new User();
        user.setUserId("1");
        user.setUsername("admin");
        user.setUstatus("a");
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
        String id ="1";
        userService.deleteUser(id);
    }

}
