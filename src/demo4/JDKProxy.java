package demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao =new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println(result);
    }
}

class UserDaoProxy implements InvocationHandler{

    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行..."+method.getName()+":传递的参数..."+ Arrays.toString(args));

        Object res = method.invoke(obj, args);

        if(method.getName().equals("add")){
            System.out.println("执行的是add方法");
        }else if(method.getName().equals("update")){
            System.out.println("执行的是update方法");
        }

        System.out.println("方法之后执行..."+obj);
        return res;
    }
}
