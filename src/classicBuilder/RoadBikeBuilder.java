package classicBuilder;
import baseBuilder.Bike;
import baseBuilder.Brakes;
import baseBuilder.Tires;

public class RoadBikeBuilder implements BikeBuilder {
	private Bike bike;
	
	public RoadBikeBuilder(){
		this.bike = new Bike();
	}
	
	@Override
	public void buildBrakes() {
		Brakes brakes = new Brakes();
		brakes.setType("Road");
		
		bike.setBrakes(brakes);
	}

	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(60);
		tire.setType("Thick");
		
		bike.setTires(tire);
	}

	@Override
	public Bike getBike() {
		return bike;
	}
}
