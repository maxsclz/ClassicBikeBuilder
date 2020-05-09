package classicBuilder;
import baseBuilder.Bike;

public interface BikeBuilder {
	
	public void buildTires();
	
	public void buildBrakes();
	
	public Bike getBike();
}
