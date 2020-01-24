package defaultpack;
class Override
{
	public void Method1()
	{
		System.out.println("No arguments Method1");
	}
	public void Method2()
	{
		System.out.println("No arguments Method2");
	}
	public void Method1(int i)
	{
		System.out.println("Method 1 int one argument");
	}
	public void Method1(double i)
	{
		System.out.println("Method 1 double one argument");
	}
	public void Method1(int i,int j)
	{
		System.out.println("Method 1 two int arguments");
	}
	
}

public class Overriding 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample s=new Sample();
		Override s =new Override();
		s.Method1();
		s.Method2();
		s.Method1(11);
		s.Method1(12, 34);
		s.Method1(1.3434);
	}

}
