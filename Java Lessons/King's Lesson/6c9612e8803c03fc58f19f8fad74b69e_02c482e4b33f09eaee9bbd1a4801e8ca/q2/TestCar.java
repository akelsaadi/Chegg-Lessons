package q2;

public class TestCar {

    public static void main(String[] args) {
        
        Car c = new Car("2010");
        c.speed(100);
        System.out.println("Default Speed: "+c.speed()+" Modified Speed: "+c.getSpeed());
    }
}
