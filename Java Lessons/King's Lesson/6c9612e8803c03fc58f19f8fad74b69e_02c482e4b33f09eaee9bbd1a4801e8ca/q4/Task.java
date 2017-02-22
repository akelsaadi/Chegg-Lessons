package q4;

public class Task {

    int ID;
    String title;
    String name;
    int price;
    String[] str;
    int index = 0;
    
    Task(int id, String t, String n, int p){
        this.ID = id;
        this.title = t;
        this.name = n;
        this.price = p;
        
        addTask(id+" "+t+" "+n+" "+p);
    }
    

    private void addTask(String stri){
        this.str[index] = stri;
        index++;
    }
    
    void printAll(){
        
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
    
}
