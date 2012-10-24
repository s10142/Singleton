
public class Main 
{

	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1.get());
		
		s1.set("Hello world 2");
		
		System.out.println(s1.get());
		
		Singleton s2 = Singleton.getInstance();
				
		System.out.println(s2.get());
		
		System.out.println(s1);
		
		System.out.println(s2);
		
	}

}
