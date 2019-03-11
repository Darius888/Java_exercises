package recursion;

public class DecToBin {

	public static int method(String s) throws NumberFormatException
	{
		int a = 0;
		int sum = 0;
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length ; ++i)
		{
			if(Character.isDigit(array[i]))
			{
				a = Character.getNumericValue(array[i]);
			} else if(Character.isLetter(array[i]))
			{
				return -1;
				throw new NumberFormatException("It's a letter, not a number !");
				
			}
			
			sum += a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method("abc"));
	}

}
