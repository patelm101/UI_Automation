import automobile.BMW;
import automobile.InheritCars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		InheritCars c1 = new InheritCars(speed);
		c1.increaseSpeed();
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headsupDisplayNavigation();

	}

}
