package Factory;

import java.util.Scanner;

public class Client {
    public static void main(String []args)
    {
    	Scanner sc=new Scanner(System.in);
    	String comp;
    	int con=1;
    	do {
    		try {
    	System.out.println("Enter the type of computer which you want to be created:");
    	comp=sc.next();
        ComputerFactory computerF=ComputerFactory.getInstance();
        computerF.create(comp).createComputer();
        }catch (NullPointerException e) {
			System.out.println("Enter a valid type of Computer");// TODO: handle exception
		}
    	finally {
        	System.out.println("Enter 1 to continue");
        	con=sc.nextInt();
        }
    	}while(con==1);
    	sc.close();
    }
}
