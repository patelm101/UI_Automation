package automobile;

public class InheritCars {
	int speed;
	
	public InheritCars(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		speed++;
		System.out.println("Increasing Speed of cars");	
	}
	
	public void decreaseSpeed(){
		speed--;
		System.out.println("Decreasing Speed of cars");
	}
}
