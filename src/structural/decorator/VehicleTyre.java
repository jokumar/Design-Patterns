package structural.decorator;

public class VehicleTyre extends VehicleDecorator{

	Vehicle vehicle ;
	public VehicleTyre(Vehicle vehicle) {
		super(vehicle);
		this.vehicle=vehicle;
	}

	@Override
	public int cost() {
		return vehicle.cost()+10;
	}

	@Override
	public String name() {
		return vehicle.name()+"+ VehicleTyre";
	}

}
