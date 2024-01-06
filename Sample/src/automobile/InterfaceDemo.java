package automobile;

public class InterfaceDemo implements CarsInterface{

	@Override
	public void enginStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
		
	}

}
