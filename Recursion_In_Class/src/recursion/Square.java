package recursion;

public class Square {

	public static int square(int n)
	{
		if(n == 1){return 1;}
		else if(n <= 0) {
		System.err.println("Negative number");
		return -1;
		}else{return square(n-1)+2*n-1;}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recursion recursion = new Recursion();
		int a = square(5);
		System.out.println(a);
	}

}
