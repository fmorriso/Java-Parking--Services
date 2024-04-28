/**
 * A simple Parking Services application
 */
public class Main
{

    public static void main(String[] args)
    {
        System.out.format("java version: %s%n", getJavaVersion());

        Vehicle v = new Vehicle("X1234567");
        System.out.println(v);
        v.setColour(Vehicle.BLACK);
        v.setColour((byte) 1);

        ParkingArea pa1 = new ParkingArea("FirstAndMain", 200);
        System.out.println(pa1);

        int slot = pa1.addVehicle(v);
        System.out.format("Vehicle %s was parked in slot %d%n", v.getRegistration(), slot);

        Vehicle v2 = new Vehicle("A9876543", Vehicle.GREEN);
        slot = pa1.addVehicle(v2);
        System.out.format("Vehicle %s was parked in slot %d%n", v2.getRegistration(), slot);

        slot = pa1.findVehicle(v2.getRegistration());
        System.out.format("Vehicle %s was parked in slot %d%n", v2.getRegistration(), slot);

        Vehicle v3 = new Car("A9876543", Vehicle.BLUE);
        int hours = 4;
        double parkingFee = v3.pay(hours);
        System.out.format("Vehicle %s pays %.2f for parking %d hours%n", v3.getRegistration(), parkingFee, hours);

        char kind = v3.getKind();
        System.out.format("Vehicle %s is of kind %c%n", v3.getRegistration(), kind);
    }

    private static String getJavaVersion()
    {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }

}
