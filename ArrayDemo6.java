
public class ArrayDemo6 
{


	public static void main(String[] args) 
	{ 
		ArrayDemo6 a1 =new ArrayDemo6();
		a1.funA();
		System.out.println(a1.funA()[0]);
		System.out.println(a1.funA()[1]);
		System.out.println(a1.funA()[2]);
		System.out.println(a1.funA()[3]);
		

	}
	
	int[] funA()	
	{  
		
	int k[]={10,20,30,40};
	return k;
	}
}
