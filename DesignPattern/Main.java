package DesignPattern;

public class Main {

	public static void main(String[] args) {
		EagerInitialize object1=EagerInitialize.instance;
		LazyInitialize object2=LazyInitialize.getInstance();
		ThreadSafe object3=ThreadSafe.getInstance();
		
	}

}
