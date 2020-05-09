package classicBuilder;
import baseBuilder.Bike;

public class BikeDirector {
	
	private BikeBuilder bikeBuilder;
	
	public BikeDirector(BikeBuilder bikeBuilder){
		this.bikeBuilder = bikeBuilder;
	}
	
	public void makeCar(){
		bikeBuilder.buildTires();
		bikeBuilder.buildBrakes();
	}
	
	public Bike getBike(){
		return this.bikeBuilder.getBike();
	}

}
