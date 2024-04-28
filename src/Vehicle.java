
public class Vehicle
{
	private String registration;
	private byte colour;
	private boolean broken;
	
	public final static byte UNKNOWN=0;
	public final static byte BLACK=1;
	public final static byte WHITE=2;
	public final static byte BLUE=3;
	public final static byte RED=4;
	public final static byte GREEN=5;
	
	private final static double ADMIN_FEE = 3;
	
	public Vehicle() {
		this("", UNKNOWN);
	}
	
	public Vehicle(String registration) {
		this(registration, UNKNOWN);
	}
	
	public Vehicle(String registration, byte colour) {
		this.registration = registration;
		this.colour = colour;
	}
	
	public boolean getBroken() {return broken;}
	public void setBroken(boolean broken) {this.broken = broken;}
	
	public byte getColour() { return colour; }
	public void setColour(byte colour) {this.colour = colour;}
	/**
	 * Gets a user-friendly display value for the colour code
	 * @return - string with a displayable version of the colour
	 */
	public String getColourDisplay() {
		switch (colour)
		{			
			case 1: return "BLACK";
			case 2: return "WHITE";
			case 3: return "BLUE";
			case 4: return "RED";
			case 5: return "GREEN";
			default: return "UNKNOWN";
		}
	}
	
	public String getRegistration() {
		return registration;
	}

	public double pay(int hours){
		if (hours <= 5)	return ADMIN_FEE;
		return 0;
	}
	
	public String toString()
	{
		return String.format("Registration: %s, Colour: %s", registration, getColourDisplay());
	}

}
