package recursion;

public class Fibonacci {
	
	public static long fib(int n, int x, int y)
	{
		if( n <= 1)
		{
			return x+y;
		} else
		{
			return fib(n-1, y, x+y);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = fib(5,0,1);
		System.out.println(a);
	}

}
