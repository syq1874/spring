package demo1.d1014.demo1;

public class Order {
    private String oname;
    private String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void order(){
        System.out.println(oname+" "+address);
    }
}
