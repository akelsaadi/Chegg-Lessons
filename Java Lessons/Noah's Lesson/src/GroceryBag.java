public class GroceryBag{
    
    public static final float MAX_WEIGHT = 5;//max weight allowed (kg)
    public static final int MAX_ITEMS = 50;//max # items allowed 
    GroceryItem[] items; // actual GroceryItems in bag 
    int numItems; // # of GroceryItems in bag 
    float weight; // current weight of bag

    public GroceryBag() {
        items = new GroceryItem[MAX_ITEMS];
        numItems = 0;
        weight = 0f;
    } 
    public int getNumItems()
    {
        return numItems;
    }
    public GroceryItem[] getItems() {
        return items;
    }

    
    public String getDescription() {
        return "GROCERY BAG " + weight + " kg";
    }

    
    public float getPrice() {
      float totalPrice = 0;      
      for(GroceryItem i : items){
          totalPrice += i.price;
      }      
      return totalPrice;
    }

    public float getTotalWeight()	{
		
		float total = 0;
		
		for(int i = 0; i <numItems; i++)	{
			
			total += items[i].getWeight();
		}
		
		return total;
	}
    public String toString() {
        if(numItems==0){
            return "An empty grocery bag";
        }
        return "A" + getTotalWeight() + "  kg grocery bag with " + numItems + " items";
    }
    
    
    public void addItem(GroceryItem g){
        float weight = g.getWeight(); 
        float max = weight + getTotalWeight();
        
        if(max<=MAX_WEIGHT) {
            items[numItems] = g;
            numItems++;
        }
        
        
    }
    
    
    public boolean removeItem(String name)	{
		
		for(int i = 0; i < numItems; i++)	{
			
			if(items[i].getName().equalsIgnoreCase(name))	{
				
				
				
				for(int j = i; j < numItems; j++)	{
				
					items[j] = items[j + 1];
				}
			
				numItems--;
				return true;
			}
		}
		
		return false;
	}
    public GroceryItem heaviestItem()
    {
        GroceryItem heaviestItem = null;
        for (int i = 0; i<numItems-1; i++)
        {
          for  (int k =0; k<numItems-1; k++)
          {
              if(items[i].getWeight() < items[k].getWeight())
              {
                  heaviestItem = items[k];
              }
              
          }
            
        }
        if (numItems == 1)
        {
            heaviestItem = items[0];
        }
        return heaviestItem;
    }
    public boolean has(GroceryItem item)
    {
        boolean holder = false;
        for (int i = 0; i<numItems; i++)
        {
            if (items[i] == item)
            {
                holder = true;
            }
                    
        }
        
            
       return holder; 
    }

    
}