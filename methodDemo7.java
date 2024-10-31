
public class methodDemo7 
{

	public static void main(String[] args)
	{
		System.out.println("main method of method Demo7");
		methodDemo7 m1=new methodDemo7();

m1.funB();
System.out.println("Done");

	}
	void funA()
	{
		System.out.println("funA method of method Demo7");
		
	}
	 void funB()
	{
		System.out.println("funB method of method Demo7");
		methodDemo7 m1=new methodDemo7();

		m1.funA();
		
	
	}

}


