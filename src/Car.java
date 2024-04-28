public class Car extends Vehicle
{
    public static double hourlyFee = 3.5;
    public double pay(int hours) {
        return super.pay(hours) + hours * hourlyFee;
    }
}
