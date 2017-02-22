package q1;

public class TestSandwich {

    public static void main(String[] args) {

        Sandwich sw = new Sandwich();
        
        sw.setIngredient("Cheese");
        sw.setBreadType("Full");
        sw.setPrice(11.50);
        
        System.out.println("Ingredient: "+sw.getIngredient()+" BreadType: "+sw.getBreadType()+" Price:"+sw.getPrice());
        
        Sandwich sw2 = new Sandwich();
        System.out.println("Ingredient: "+sw2.getIngredient()+" BreadType: "+sw2.getBreadType()+" Price:"+sw2.getPrice());
		
		
		    }
    
}
