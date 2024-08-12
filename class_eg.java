class pen{
    String color;
    String type;
    int quantity;
    int amount;
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
    public void printquantity(){
        System.out.println(this.quantity);
    }
    public void printprice(){
        System.out.println(this.quantity*this.amount);
    }

}

public class class_eg {
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="red";
        pen1.type="gel";
        pen1.quantity=20;
        pen1.amount=10;

        pen1.printtype();
        pen1.printcolor();
        pen1.printprice();

    }
}
