package DesignPattern;

public class LazyInitialize {

	public static LazyInitialize instance;
	private LazyInitialize()
	{
		
	}
	public static LazyInitialize getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInitialize();
		}
		return instance;
	}
}
