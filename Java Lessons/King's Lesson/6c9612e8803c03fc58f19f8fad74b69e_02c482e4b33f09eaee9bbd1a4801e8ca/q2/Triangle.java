package q2;

public class Triangle {

    int a;
    int b;
    int c;
    
    Triangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    int Compute(){
        c = a*a + b*b;
        return c;
    }
}
