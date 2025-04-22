package mavenAID;

public class Car {
	String color;
	int speed;
	
	public void info()
	{
		System.out.println("The color of car is "+color+" and the speed is "+speed);
	}	

	public static void main(String[] args) {
		
		Car maruti = new Car();
		maruti.color= "white";
		maruti.speed= 120;
		maruti.info();
	}

}
