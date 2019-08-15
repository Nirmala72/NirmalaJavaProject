package methodDemo;

public class Bag
{
	
	public static void main(String[] args) {
	Bag obj = new Bag();
		obj.sum(87.33);
		obj.sum(543);
		obj.sum("blue");
		obj.sum(5, 2);
	}	
	
	public void sum(Double price)
	{
		
		System.out.println("bag price");
		System.out.println(price);
	}
	public void sum(int purchase, int sale) {
		System.out.println("purchse and sale");
		System.out.println(purchase+sale);
	}
			
	public void sum(int szie)
	{
		System.out.println("bag szie");
		System.out.println(szie);
		
	}

	public void sum(String Colour)
	{
		System.out.println("bag Colour");

	System.out.println(Colour);
	
	}
	
}




	
	
	






		
		
		
		

