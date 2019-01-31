
public class Controller {
    private EmployeeModel empModel;
    private EmployeeView empView;
	public Controller(EmployeeModel empModel,EmployeeView empView)
	{
		this.empModel=empModel;
		this.empView=empView;
	}
	public void setEmployeeName(String empName)
	{
		empModel.setEmpName(empName);
	}
	public void setEmployeeId(int empId)
	{
		empModel.setEmpId(empId);
	}
	public void setEmployeeSalary(double empSalary)
	{
		empModel.setEmpSalary(empSalary);
	}
	public void setEmployeePosition(String empPosition)
	{
		empModel.setEmpPosition(empPosition);
	}
	public int getEmployeeId() {
		return empModel.getEmpId();
	}
	public double getEmployeeSalary() {
		return empModel.getEmpSalary();
	}
	public String getEmployeePosition() {
		return empModel.getEmpPosition();
	}
	public String getEmployeeName() {
		return empModel.getEmpName();
	}
    public void showDetails()
    {
    	empView.viewEmployeeDetails(empModel.getEmpName(),empModel.getEmpId(),
    			empModel.getEmpSalary(),empModel.getEmpPosition());
    }
}
