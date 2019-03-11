package uc3m.swimming.pool;

public class Staff extends Person{
	private int salary;
	
	public Staff(String dni, int salary)
	{
		super(dni);
		this.salary = salary;
	}
	
	public String toString()
	{
			
		  String string = new String("DNI : " + super.getDni() + ", Salary "  + this.salary);
		  return string ;
	}
}
