package defaultpack;

class Animal
{
	String  cname="Animal";
	public void Dog()
	{
		System.out.println("Dog is an animal");
	}
	public void Cat()
	{
		System.out.println("Cat is an animal");
	}
	public void Tiger()
	{
		System.out.println("Tiger is an animal");
	}
	public void Bat()
	{
		System.out.println("Bat is a mammal");
	}
}

class Birds extends Animal
{
	String cname="Birds";
	public void Crow()
	{
		System.out.println("Crow is a bird");
	}
	public void Parrot()
	{
		System.out.println("PArrot is a bird");
	}
	public void disp()
	{
		System.out.println("Name in sub "+cname);
		System.out.println("Name in super "+super.cname);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Birds();
		b.disp();
		b.Bat();
		b.Cat();
		b.Crow();
		b.Tiger();
	}

}
