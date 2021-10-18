package demo3.d1018.service;

import org.springframework.stereotype.Component;

@Component(value = "userService")           //value可以不写，默认为类名称首字母小写
public class UserService {

    public void add(){
        System.out.println("service add...");
    }
}
