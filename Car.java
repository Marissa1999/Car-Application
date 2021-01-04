

/**
 * Represents a car using only three attributes: year, make, and speed.
 * @author ghaderps
 */
public class Car {
    private int yearModel;
    private double speed;
    private String make;
    
    /**
     * Creates a string representation for this Car object. 
     * It displays the make of the car followed its year model and current speed.
     * @return A string representation of this Car object.
     */
    public String toString()
    {
        String result = "";
        result += "Make:    " + this.getMake();
        result += "\nYear:  " + this.getYearModel();
        result += "\nSpeed: " + String.format("%.2f", this.getSpeed());
        return result;
    }

    /**
     * Normal constructor.
     * @param yearModel The year model of 'this' car.
     * @param make The make of 'this' car.
     */
    public Car(int yearModel, String make)
    {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    
    /**
     * Return the year model of this car.
     * @return The year model of this car.
     */
    public int getYearModel()
    {
        return yearModel;
    }
    
    /**
     * Return the make of this car.
     * @return The make of this car.
     */
    public String getMake()
    {
        return make;
    }
    
    /**
     * Return the speed of this car.
     * @return The speed of this car.
     */
    public double getSpeed()
    {
        return speed;
    }
    
    /**
     * Increase the speed of this car by 5 units.
     */
    public void accelerate()
    {
        setSpeed(getSpeed() + 5);
    }
      /**
       * Increase the speed of this car by s given amount.
     * @param increment The speed increment amount.
     */
    public void accelerate(double increment)
    {
        setSpeed(getSpeed() + increment);
    }
    /**
     * Slows down the speed of this car by 5 units.
     */
    public void brake()
    {
        setSpeed(getSpeed() - 5);
    }
    
    /**
     * Compares the 'this' car to the 'other_car'.
     * @param other_car The other car to compare 'this' car to.
     * @return true, if the objects of the 'this' and the 'other_car' have 
     *         exactly the same values for their corresponding instance 
     *         variable; otherwise, false.
     */
    public boolean equals(Car other_car) {
        return(this.getYearModel() == other_car.getYearModel() && 
                this.getMake().equals(other_car.getMake()) && this.getSpeed() == other_car.getSpeed() );
        
    }

    /**
     * @param yearModel the yearModel to set
     */
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
}
