package demo2.d1016.bean;

public class Orders {
    private String oname;

    public Orders(){
        System.out.println("调用无参构造方法创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("set方法设置属性值");
    }

    public void init(){
        System.out.println("执行初始化方法！");
    }

    public void destroy(){
        System.out.println("执行销毁的方法");
    }
}
