
public class TestCar {
    public static void main(String[] args)
    {
        Car car1 = new Car(1014, "Honda");
                
        double currentSpeed;
        for (int i = 0; i<5; i++)
        {
            car1.accelerate(Math.random()*11);
            currentSpeed = car1.getSpeed();
            System.out.println("The current speed is " + currentSpeed);
        }
        
        System.out.println(car1);
        for (int k = 0; k<5; k++)
        {
            car1.brake();
            currentSpeed = car1.getSpeed();
            System.out.println("The current speed is " + currentSpeed);
        }
    }
}
