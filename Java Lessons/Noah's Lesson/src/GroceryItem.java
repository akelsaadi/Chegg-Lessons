public class GroceryItem {
    
    String name; 
    float price; 
    float weight;
    private boolean perishable;
    
    public GroceryItem(String n, float p, float w){
        name = n; 
        price = p; 
        weight = w; 
    } 
    
    public  GroceryItem(String n, float p, float w, boolean pe){
        name = n;
        price = p;
        weight = w;
        perishable = pe;
    }

    public float getWeight(){
            return weight;
        }

   
    public GroceryItem[] getContents() {
        return new GroceryItem[0];
    }

    
    public String getName() {
        return name;
    }

     
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " weighing " +weight  + " kg with price $" + price;
    }
    
    
    
    
}