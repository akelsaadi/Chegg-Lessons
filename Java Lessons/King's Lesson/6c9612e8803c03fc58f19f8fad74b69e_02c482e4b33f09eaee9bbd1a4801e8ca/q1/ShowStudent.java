package q1;

public class ShowStudent {

        public static void main(String[] args) {
        
            Student st = new Student(01);
            
            st.addCourse(3, 9);
            st.addCourse(3, 12);
            st.addCourse(3, 12);
            
            System.out.println("Grade Point Average = "+st.computeGPA());
            
        }
    
}
