package aop.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* aop.demo1.User.add(..))")
    public void before(){
        System.out.println("before");
    }

    @After(value = "execution(* aop.demo1.User.add(..))")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning(value = "execution(* aop.demo1.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing(value = "execution(* aop.demo1.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @Around(value = "execution(* aop.demo1.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
