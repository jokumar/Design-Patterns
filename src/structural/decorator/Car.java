package structural.decorator;

public class Car implements Vehicle{
	
	@Override
	public int cost() {
		
		return 100;
	}

	@Override
	public String name() {
		return " Car ";
	}

}
