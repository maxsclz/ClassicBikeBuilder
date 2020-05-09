package classicBuilder;
import baseBuilder.Bike;
import baseBuilder.Tires;
import baseBuilder.Brakes;

public class MountainBikeBuilder implements BikeBuilder{
private Bike bike;
	
	public MountainBikeBuilder(){
		this.bike = new Bike();
	}
	
	@Override
	public void buildBrakes() {
		Brakes brakes = new Brakes();
		brakes.setType("Mountain");
		
		bike.setBrakes(brakes);
	}

	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(200);
		tire.setType("Thick");
		
		bike.setTires(tire);
	}

	@Override
	public Bike getBike() {
		return bike;
	}
	

}
