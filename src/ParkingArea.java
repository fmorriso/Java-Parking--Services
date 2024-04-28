public class ParkingArea
{
    private Vehicle vehicles[];
    private String name;

    /**
     * Creates a instance of a parking area using the specified name and capacity
     *
     * @param name     - the name of the parking area
     * @param capacity - the number of parking spots, with a limit of 300 max.
     */
    public ParkingArea(String name, int capacity)
    {
        this.name = name;
        if (capacity > 300) capacity = 300;
        this.vehicles = new Vehicle[capacity];
    }

    private ParkingArea()
    {/* prevent uninitialized instances */}

    public String getName()
    {
        return name;
    }

    public int getCapacity()
    {
        return vehicles.length;
    }

    public String toString()
    {
        return String.format("Name: %s, capacity: %d", name, getCapacity());
    }

    /**
     * @param reg - registration value of the vehicle we are trying to find
     * @return - integer index within the vehicles array where the vehicle was
     * found or -1 if not found.
     */
    public int findVehicle(String reg)
    {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getRegistration().equals(reg)) return i;
        }
        return -1;
    }

    /**
     * Adds a vehicle to the parking area by finding the first available unused parking slot.
     *
     * @param v - the Vehicle instance to add.
     * @return - the index of the slot the vehicle was placed into or -1 if no slots are available.
     */
    public int addVehicle(Vehicle v)
    {

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = v;
                return i;
            }
        }

        return -1;
    }

    public Vehicle removeVehicle(String reg)
    {
        Vehicle leaving = null;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null
                    && vehicles[i].getRegistration().equals(reg)) {
                leaving = vehicles[i];
                vehicles[i] = null;
                return leaving;
            }
        }
        return leaving;
    }
}