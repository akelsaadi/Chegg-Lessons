public interface Matrix {
    
   
    public int getElement(int y, int x);

    
    public int getRows();
    
    
    public int getColumns();
            
   
    public Matrix scale(int scalar);
    
    
    public Matrix plus(Matrix other);
    
    
    public Matrix minus(Matrix other);
    
   
    public boolean equals(Object other);
    
    
    public String toString();
}
