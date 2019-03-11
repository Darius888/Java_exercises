package uc3m.swimming.pool;

public class Tenured extends Professor {
	
	
	
	public Tenured(String dni,String dept)
	{
		super(dni,2500,dept);
	}
	
	public String toString()
	{
	    String string = new String("DNI : " + super.getDni() + ", Salary :" + super.getSalary() + ", Department : "  +  super.getDept() );
	    return string ;
	}

}
