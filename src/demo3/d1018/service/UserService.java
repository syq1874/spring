package demo3.d1018.service;

import demo3.d1018.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service           //value可以不写，默认为类名称首字母小写
public class UserService {

    @Value(value = "abc")       //注入普通类型属性
    private String name;

    //不需要生成set方法
    //@Autowired                //根据属性类型自动装配
    //@Qualifier(value = "userImpl1")       //根据属性名称进行注入
    @Resource(name = "userImpl1")           //既可以根据类型注入，又可以根据属性注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add...");
        System.out.println(name);
        userDao.add();
    }
}
