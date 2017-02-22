package q5;

public class EmployeeScheduler {

    public static void main(String[] args) {

        int size = 5;
        Employee e = new Employee();
        e.readFile(size);

        System.out.println("40-Hour Work Week Plan: \n");
        
        for (int i = 0; i < size; i++) {

            System.out.println("Name: " + e.fname[i] +" "+ e.lname[i] + " having skills of "+ e.skill[i]);
            System.out.println("Per Hour Rate: " + e.wage[i]);
            System.out.println("40 Hour Rate: " + 40*e.wage[i]);
            System.out.println();
        }
    }
}
