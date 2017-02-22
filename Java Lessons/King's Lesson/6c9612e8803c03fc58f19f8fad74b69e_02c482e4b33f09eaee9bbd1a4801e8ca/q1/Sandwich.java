package q1;

public class Sandwich {

    String mainIngredient;
    String breadType;
    double price;
    
    Sandwich(){
        this.mainIngredient = "turkey";
        this.breadType = "rye";
        this.price = 5.99;
    }
    
    void setIngredient(String ingre){
        this.mainIngredient = ingre;
    }
    
    void setBreadType(String breadType){
        this.breadType = breadType;
    }
    
    void setPrice(double price){
        this.price = price;
    }
    
    String getIngredient(){
        return mainIngredient;
    }
    
    String getBreadType(){
        return breadType;
    }
    
    double getPrice(){
        return price;
    }
}
