abstract class cars
{
 public void model()
	{
	 System.out.println("VOLVO X60");
	}
}
class benz extends cars
{
	public void model()
	{
		System.out.println("BENZ ECLASS");
	}
}
class abstractclass
{
	public static void main(String[] args) 
	{
		benz carz=new benz();
		carz.model();
	}
}
