package defaultpack;
class Sample
{
	int num1,num2,num3;
	double d1;
	static String s1;
	public Sample()
	{
		System.out.println("In First");
	}
	public Sample(int i,int j)
	{
		System.out.println("In second");
	}
	static
	{
		s1="WELCOME";
	}
	public Sample(double d,int a)
	{
		System.out.println("In Third");
	}
	public void display()
	{
		System.out.println("Welcome");
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.display();
		Sample s1=new Sample(12.3,34);
		Sample s2=new Sample(12,4);
	}

}
