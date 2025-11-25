//Written by Christopher Lopez
//extends keyword allows the properties of vehicle to be passed down to car
public class Car extends Vehicle{

	private double gas;
	private int passengers;
	
//super keyword allows the car subclass to access variables from vehicle
	public Car() {
		super("none", 6, "none");
		this.gas = 1.0;
		this.passengers = 1;
	}
	
//sets the parameters for a truck that takes variables from the vehicle first then from it's own set of variables
	public Car(String manu, int cylinder, String owner, double gas, int passengers) {
		super(manu, cylinder, owner);
		setgas(gas);
		setpassengers(passengers);
	}
	
	public void setgas(double gas) {
		if(gas < 0) {
			this.gas = 1.0;
		}
		else {
			this.gas = gas;
		}
	}
	
	double getgas() {
		return this.gas;
	}
	
	public void setpassengers(int passengers) {
		if(passengers < 0) {
			this.passengers = 1;
		}
		else {
			this.passengers = passengers;
		}
	}
	
	int getpassengers() {
		return this.passengers;
	}

//super.tostring shows the vehicle variables in a string format then the specific variables for the subclass
	public String toString() {
		String description = super.toString() + 
							 "\nGas Milage: " + getgas() + 
							 "\nNumber of Passengers: " + getpassengers();
		return description;
	}
	
	public boolean equals(Car a) {
		return a !=null &&
				super.equals(a) &&
				this.gas == a.getgas() &&
				this.passengers == a.getpassengers();
				
	}
	
}


