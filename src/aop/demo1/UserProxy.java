package aop.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* aop.demo1.User.add(..))")
    public void before(){
        System.out.println("before");
    }
}
