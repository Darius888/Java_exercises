package uc3m.swimming.pool;

public class Intern extends Student {
	private int salary;
	
	public Intern(String dni,String nia , int salary)
	{
		super(dni,nia);
		this.salary = salary ;
	}
	
	public String toString()
	{
		String string = new String("DNI : " + super.getDni() + ", NIA : " + super.getNia()  + " , Salary :" + this.salary);
		return string;
	}
}
