package methodDemo;

public class Television {

	public static void main(String[] args) {
		
		Television obj = new Television();

		obj.sum(16.4);
		obj.sum("pink");
		obj.sum(22, 8500);
		     
		}
	
	public void sum(String Tv)
	{ 
		System.out.println("tv Colour");
		System.out.println(Tv);
		
	}

public void sum(int inch, int price)
{
	
	System.out.println("inch and price");
	System.out.println(inch + price);
}

public void sum(double Model)

{
	System.out.println("Model");
	System.out.println(Model);
}
}
