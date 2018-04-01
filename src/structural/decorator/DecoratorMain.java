package structural.decorator;
/**
 * 
 * @author jokumar
 *
 * Open CLosed Principle : Classes should be open for extension but closed for modification
 * 
 * Decorator pattern will add new behaviors in the object dynamically in run time without using inheritance
 * Can be used when requirements are changing and we need to achieve it with minimal modifications
 * 
 */
public class DecoratorMain {

  public static void main(String[] args){
	  Vehicle v=new VehicleSeatCover(new VehicleTyre(new Car()));
	  
	  
	  System.out.println(v.cost());
	  System.out.println(v.name());
  }
	
}
