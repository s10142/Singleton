public final class Singleton 
{
 
    private static Singleton instance = null;
 
    public static Singleton getInstance()
    {
        if (instance == null) 
        {
            synchronized (Singleton.class) 
            {
                if (instance == null) 
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    private static String a="Hello world 1";
    
    public String get()
    {
		return a;
    }
    public void set(String b)
    {
    	a=b;
    }
    
    private Singleton() {};
 
}