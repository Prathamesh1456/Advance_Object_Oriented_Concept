

class Employee{
	
		private String firstName;
		private String lastName;
		private double monthlySalary;
	public Employee(String firstName,String lastName,double monthlySalary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary>0)
		{
			this.monthlySalary=monthlySalary;
		}
		else
		{
			this.monthlySalary=0.0;
		}
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public double getYearlySalary()
	{
		return monthlySalary*12;
	}
	public void setMonthlySalary(double monthlySalary){
		if(monthlySalary>0)
		{
			this.monthlySalary=monthlySalary;
		}
		else
		{
			this.monthlySalary=0.0;
		}
	}		
}
public class EmployeeTest{
	public static void main(String[] args) {
		Employee e1=new Employee("Prathamesh","Pise",400);
		Employee e2=new Employee("Adarsh","Chougule",4000);
		System.out.println("Yearly Salary:  ");
		System.out.println(e1.getFirstName()+"  "+ e1.getLastName()+"  "+ ":"+"  "+ e1.getYearlySalary());
		System.out.println(e2.getFirstName()+"  "+ e2.getLastName()+"  "+ ":"+"  "+ e2.getYearlySalary());
		e1.setMonthlySalary(e1.getMonthlySalary()*1.10);
		e2.setMonthlySalary(e2.getMonthlySalary()*1.10);
		System.out.println("Yearly Salary after 10% raise:  ");
		System.out.println(e1.getFirstName()+"  "+ e1.getLastName()+"  "+ ":"+ e1.getYearlySalary());
		System.out.println(e2.getFirstName()+"  "+ e2.getLastName()+"  "+ ":"+ e2.getYearlySalary());

	}
}