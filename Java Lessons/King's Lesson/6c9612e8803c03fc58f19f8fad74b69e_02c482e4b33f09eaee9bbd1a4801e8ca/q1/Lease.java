package q1;

public class Lease {

    String name;
    int no;
    int monthlyRent;
    int termLease;

    Lease() {
        this.name = "XXX";
        this.no = 0;
        this.monthlyRent = 1000;
        this.termLease = 12;
    }
    
    void setName(String name){
        this.name = name;
    }

    void setNo(int no){
        this.no = no;
    }
    
    void setRent(int rent){
        this.monthlyRent = rent;
    }
    
    void setLease(int lease){
        this.termLease = lease;
    }
    
    String getName(){
        return this.name;
    }
    
    int getNo(){
        return this.no;
    }
    
    int getRent(){
        return this.monthlyRent;
    }
    
    int getLease(){
        return this.termLease;
    }
    
    void addPetfee(){
        this.monthlyRent += 10;
        explainPetPolicy();
    }
    
    static void explainPetPolicy(){
        System.out.println("Pet Fee Explanation");
    }
}

