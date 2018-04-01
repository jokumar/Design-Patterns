package structural.decorator;

public class VehicleSeatCover extends VehicleDecorator{

	Vehicle vehicle ;
	public VehicleSeatCover(Vehicle vehicle) {
		super(vehicle);
		this.vehicle=vehicle;
	}

	@Override
	public int cost() {
		return vehicle.cost()+50;
	}

	@Override
	public String name() {
		return vehicle.name()+"+ VehicleSeatCover";
	}

}
