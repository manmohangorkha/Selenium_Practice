package mavenAID;

public class Sum {
	
	int a,b,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Sum of a & b is "+c);
	}
	public static void main(String[] args) {
	Sum addkro = new Sum();
	addkro.a=15;
	addkro.b=12;
	addkro.add();
	
	}	
}
