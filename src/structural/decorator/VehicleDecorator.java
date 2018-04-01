package structural.decorator;

public abstract class VehicleDecorator implements Vehicle {
	
	private  int cost ;
	private String name;
	
	public VehicleDecorator(Vehicle vehicle){
		this.cost=vehicle.cost();
		this.name=vehicle.name();
	}
	
	@Override
	public int cost() {
		return cost;
	}

	@Override
	public String name() {
		return name;
	}

}
