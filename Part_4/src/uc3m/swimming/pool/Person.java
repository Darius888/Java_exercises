package uc3m.swimming.pool;

public class Person {
	private String dni;
	
	public Person(String dni)
	{
		this.dni = dni ;
	}
	
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	public String getDni()
	{
		return dni;
	}
	
	public String toString()
	{
	    String string = new String("DNI : " + this.dni);
	    return string ;
	}
	
	public String toStringDni()
	{
		 String string = new String("DNI : " + this.dni);
		 return string ;
	}
}
