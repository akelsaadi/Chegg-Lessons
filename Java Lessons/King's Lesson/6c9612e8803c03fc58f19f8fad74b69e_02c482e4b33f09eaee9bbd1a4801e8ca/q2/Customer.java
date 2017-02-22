package q2;

public class Customer {

    String name;
    String lastName;
    
    Customer(String n, String ln){
        this.name = n;
        this.lastName = ln;
    }
    
    void getName(){
        System.out.println(name);
    }
    
    void getLastName(){
        System.out.println(lastName);
    }

    void pay(){
        CreditCard cc = new CreditCard();
        cc.pay();
    }
    
    class CreditCard{

        void pay(){
            System.out.println("Paid");
        }
     }
}
