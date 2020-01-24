package defaultpack;

abstract class AbstractClass
{
	public abstract void sing();
	String str;
	int id;
	public abstract void dance();
	public void laugh()
	{
		System.out.println("Laughing.....");
	}
	
}
abstract class AbstractSing extends AbstractClass
{
	public void sing()
	{
		System.out.println("Singing....");
	}
	public void speak()
	{
		System.out.println("Speaking....");
	}
}

class AbstractDance extends AbstractSing
{
	public void dance() 
	{
		System.out.println("Dancing....");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClass a=new AbstractDance();
		a.laugh();
		a.dance();
		a.sing();
	}

}
