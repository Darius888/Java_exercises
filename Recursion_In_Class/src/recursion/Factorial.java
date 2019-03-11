package recursion;

public class Factorial {
	
	public static long fac(int n, int m)
	{
		if(n <= 1)
		{
			return m;
		}
		else
		{
			return fac(n-1, n*m);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recursion recursion = new Recursion();
		long a = fac(4,1);
		System.out.println(a);
	}

}
