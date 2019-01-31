import java.util.Scanner;
public class Main {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
	EmployeeModel empModel=new EmployeeModel();
	EmployeeView empView =new EmployeeView();
	Controller controller1 = new Controller(empModel,empView);
	controller1.setEmployeeName("Gagan");
	controller1.setEmployeeId(400);
	controller1.setEmployeeSalary(50000.00);
	controller1.setEmployeePosition("Developer");
	controller1.showDetails();
	System.out.println();
	//Controller controller2 = new Controller(empModel,empView);
	controller1.setEmployeeName("Murali");
	controller1.setEmployeeId(401);
	controller1.setEmployeeSalary(40000.00);
	controller1.setEmployeePosition("Trainee");
	controller1.showDetails();
	System.out.println();
	EmployeeModel empModel1=setTheEntries();
	//Controller controller3=new Controller(empModel1,empView);
	controller1.showDetails();
	System.out.println();
	try
	{
	System.out.println("Enter the name of Employee");
	String name=sc.next();
	System.out.println("Enter the id of employee");
	int id=sc.nextInt();
	System.out.println("Enter the Salary of employee");
	double salary=sc.nextDouble();
	System.out.println("Enter the position of employee");
	String position=sc.next();
	//Controller controller4=new Controller(empModel,empView);
	controller1.setEmployeeName(name);
	controller1.setEmployeeId(id);
	controller1.setEmployeeSalary(salary);
	controller1.setEmployeePosition(position);
	controller1.showDetails();
	}
	catch(Exception e)
	{
		System.out.println("Print Valid Value");
	}
	sc.close();
	}
	private static EmployeeModel setTheEntries()
	{
		EmployeeModel empModel=new EmployeeModel();
		empModel.setEmpName("Farhan");
		empModel.setEmpId(403);
		empModel.setEmpPosition("Lead");
		empModel.setEmpSalary(70000.00);
		return empModel;
	}
}
