package Factory;

public class Server implements Computer {
	@Override
	public void createComputer() {
		System.out.println("Server is Created");
		
	}
}
