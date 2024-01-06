package automobile;

public class BMW extends InheritCars{
	public BMW(int startSpeed){
		super(startSpeed);
	}
	
	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of BMW");
		
	}
	
	public void headsupDisplayNavigation(){
		System.out.println("BMW specific Functionality");
	}
}
