package demo1.d1015.Test;

import demo1.d1015.bean.Emp;
import demo1.d1015.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBean {
    @Test
    public void testadd(){
        //1.加载spring配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("demo1/bean2.xml");
        //2.获取创建配置的对象
        UserService userService = context.getBean("userService", UserService.class);
        //System.out.println(userService);
        userService.add();
    }

    @Test
    public void testBean(){
        //1.加载spring配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("demo1/bean3.xml");
        //2.获取创建配置的对象
        Emp emp = context.getBean("emp", Emp.class);
        //System.out.println(userService);
        emp.add();
    }


}
