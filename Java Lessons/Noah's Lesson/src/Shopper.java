public class Shopper {
    
    public static final int MAX_ITEMS =100;// max # items allowed 
    GroceryItem[] shoppingCart; // items to be purchased 
    int numItems; // #items to be purchased  

    public Shopper() {
        shoppingCart = new GroceryItem[MAX_ITEMS];
        numItems = 0;
    }
    
    public int getNumItems()
    {
        return numItems;
    }
    public GroceryItem[] getCart()
    {
        return shoppingCart;
    }
    
    public void packBags(GroceryItem g){
        
        GroceryBag bag = new GroceryBag();
        GroceryItem[] packedItems = new GroceryItem[MAX_ITEMS];
       
        
        if(g.weight>GroceryBag.MAX_WEIGHT){
            packedItems[numItems] = g;
        }
        
        //continue packaging same bag
         if(isWeightAllowed(bag.getItems())){
            bag.addItem(g);
        }
        shoppingCart[numItems] = g;        
        numItems ++;
    }
    
    void addItem(GroceryItem g){
        packBags(g);
    }
    
     private boolean isWeightAllowed(GroceryItem[] currentItem) {
        
        
        float currentWeight = 0;
        for(GroceryItem item : currentItem){
            if(item==null) break;
            currentWeight += item.weight;
        }
        if(currentWeight>GroceryBag.MAX_WEIGHT){
            return false;
        }        
        return true;
    }
    
    
    public String toString() { 
        return "Customer with shopping cart of " + numItems + " items"; 
    }
    
    
    
    
}