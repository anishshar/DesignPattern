package Factory;


public class ComputerFactory {
	private static ComputerFactory computerFactory;
	private ComputerFactory()
	{
		
	}
	public static ComputerFactory getInstance()
	{
		if(computerFactory==null)
		{
			return computerFactory=new ComputerFactory();
		}
		return computerFactory;
	}
       public static Computer create(String type)
       {
    	   if(type.equalsIgnoreCase("server"))
    	   {
    		   return new Server();
    	   }
    	    if(type.equalsIgnoreCase("PC"))
    	   {
    		   return new PC();
    	   }
			return null;
       }
}
