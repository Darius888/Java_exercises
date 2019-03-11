package uc3m.swimming.pool;

public class Professor extends Person {
	private int salary;
	private String dept;
	
	public Professor(String dni, int salary, String dept)
	{
		super(dni);
		this.salary = salary ;
		this.dept = dept ;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		 String string = new String("DNI : " + super.getDni() + ", Salary : " + this.salary + ", Department " + this.dept);
		 return string ;
	}
}
