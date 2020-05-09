package baseBuilder;

public class Bike {
	
	private Tires tires;
	
	private Brakes brakes;
	
	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	public Brakes getBrakes() {
		return brakes;
	}

	public void setBrakes(Brakes brakes) {
		this.brakes = brakes;
	}

	@Override
	public String toString() {
		return "Bike [tires=" + tires + ", brakes=" + brakes + "]";
	}
}
