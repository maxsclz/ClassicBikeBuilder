package classicBuilder;
import baseBuilder.Bike;

public class Customer {

	public static void main(String[] args){
		
		BikeBuilder bikeBuilder = new RoadBikeBuilder(); //Road, Mountain zmiana konkretnego budowniczego w zaleznosci od klienta
		BikeDirector bikeDirector = new BikeDirector(bikeBuilder);
		bikeDirector.makeBike();
		
		Bike bike = bikeDirector.getBike();
		System.out.println(bike);
	}
}
