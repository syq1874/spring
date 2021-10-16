package demo1.d1014.demo1;

public class Book {
    private String bname;

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    //构造方法注入
    /*public Book(String bname) {
        this.bname = bname;
    }*/

    public void testDemo(){
        System.out.println(bname);
    }
}
