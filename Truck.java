//Written by Christopher Lopez

//extends keyword allows the properties of vehicle to be passed down to truck
public class Truck extends Vehicle{

	private double load;
	private double tow;
//super keyword allows the truck subclass to access variables from vehicle
	public Truck() {
		super("none", 6, "none");
		this.load = 1.0;
		this.tow = 1.0;
	}
	
//sets the parameters for a truck that takes variables from the vehicle first then from it's own set of variables
	public Truck(String manu, int cylinder, String owner, double load, double tow) {
		super(manu, cylinder, owner);
		setload(load);
		settow(tow);
	}
	
	public void setload(double load) {
		if(load < 0) {
			this.load = 1.0;
		}
		else {
			this.load = load;
		}
	}
	
	double getload() {
		return this.load;
	}
	
	public void settow(double tow) {
		if(tow < 0) {
			this.tow = 1.0;
		}
		else {
			this.tow = tow;
		}
	}
	
	double gettow() {
		return this.tow;
	}
	
//super.tostring shows the vehicle variables in a string format then the specific variables for the subclass
	public String toString() {
		String description = super.toString() + "\nTowing Capacity: " + gettow() +"\nLoad Capacity: " + getload();
		return description;
	}
	
	public boolean equals(Truck a) {
		return a !=null &&
				super.equals(a) &&
				this.tow == a.gettow() &&
				this.load == a.getload();
				
	}
	
}
