package uc3m.swimming.pool;

public class Student extends Person {
	private String nia;
	
	public Student(String dni, String nia)
	{
		super(dni);
		this.nia = nia;
	}
	
	public void setNia(String nia)
	{
		this.nia = nia;
	}
	
	public String getNia()
	{
		return nia;
	}
	
	public String toString()
	{
		 String string = new String("DNI : " + super.getDni() + ", NIA : " + this.nia);
		 return string ;
	}
	
	
}
