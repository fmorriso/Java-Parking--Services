public class Car extends Vehicle
{
    public static double hourlyFee = 3.5;

    // String registration, byte colour
    public Car(String registration, byte colour){
        super(registration, colour);
    }

    public Car(String registration) {
        super(registration);
    }

    public double pay(int hours) {
        return super.pay(hours) + hours * hourlyFee;
    }
}
