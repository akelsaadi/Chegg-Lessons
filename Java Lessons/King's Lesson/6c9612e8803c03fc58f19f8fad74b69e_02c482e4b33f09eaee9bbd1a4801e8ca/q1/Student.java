package q1;

public class Student {

    int ID;
    int noOfCredit = 0;
    int noOfPoints = 0;
    double GPA;
    
    Student(int ID){
        this.ID = ID;
    }
    
    Student(int ID, int points, int credit){
        this.ID = ID;
        this.noOfCredit = credit;
        this.noOfPoints = points;
    }
    
    void addCourse(int credit, int points){
        
        this.noOfCredit += credit;
        this.noOfPoints += points;
    }
    
    double computeGPA(){
        
        this.GPA = this.noOfPoints / this.noOfCredit;
        return this.GPA;
    }
}
