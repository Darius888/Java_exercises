package recursion;

public class Riddle {
	
	public static int riddle(int p, int q)
	{
		if(p == 0)
		{
			return q;
		} 
		else
		{
			return riddle(p-1, q+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recursion recursion = new Recursion();
		int a = riddle(3,5);
		System.out.println(a);
	}

}
