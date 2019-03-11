package section_7;

public class NumbersCruncher {
	private int[] integers;
		public NumbersCruncher(int[] integers) {
			this.integers = integers;
		}
	public int sum() {
		int total = 0;
		for (int i = 0; i < integers.length; i++) {
			total += integers[i];
		}
	return total;
	}
	public int max() {
		int max = integers[0];

			for (int i = 0; i < integers.length; i++) {

			if (integers[i] > max) {
				max=integers[i];			
				}
			}
		return max;
	}
	public int sum_squared() {
		
		int sum_squared = 0;
		for ( int i = 0; i< integers.length; i++) {
		
			sum_squared += integers[i]*integers[i];		
		}
		return sum_squared;
	}
	public String is_neg() {
		
		int negative = 0;
		
		String yes = "yes";
		String no = "no";
		
		for ( int i = 0; i< integers.length; i++) {
		
			if (integers[i] < 0) {
				negative += 1;
			} 
		}
		if (negative > 0)
		return yes;
		else
		return no;
	}
	public int[] neg() {
		int length=integers.length;
		int[] negated = new int[length];
		for ( int i = 0; i< integers.length; i++) {
		
			 negated[i]=integers[i]-integers[i]-integers[i];
			// System.out.println(negated[i]);
		}
		return negated ;
	}
	public int[] diff() {
		int length=integers.length;
		int[] diff = new int[length];
		
		for ( int i = 0; i< integers.length-1; i++) {
		
			  diff[i]=integers[i+1]-integers[i];
			
		}
		return diff;
	}
	public static void main(String[] args) {
		
		int[] values;
		if (args.length >= 2) {
			values = new int[args.length-1];

			for (int i = 1; i < args.length; i++) {
			values[i-1] = Integer.parseInt(args[i]);
			}
		} else {
			values = new int[0];
	}
	NumbersCruncher cruncher = new NumbersCruncher(values);
/*
* TO DO: print the result of calling the sum() and
* max() methods, or show some error messages if
* necessary
*
*/				
		 if (args[0].equals("sum")) {
			int temp=0;
			temp=cruncher.sum();
			System.out.println(temp);
		} else if (args[0].equals("max")) {
			int temp=0;
			temp=cruncher.max();
			System.out.println(temp);
		} else if (args[0].equals("sum-squared")) {
			int temp=0;
			temp=cruncher.sum_squared();
			System.out.println(temp);
		} else if (args[0].equals("is-neg")) {
			String temp="something";
			temp=cruncher.is_neg();
			System.out.println(temp);
		} else if (args[0].equals("neg")) {
			int[] temp=cruncher.neg();
			for ( int i = 0; i<temp.length; ++i) {
				System.out.print(" " + temp[i] + " ");
			}
		} else if (args[0].equals("diff")) {
			int[] temp=cruncher.diff();
			for ( int i = 0; i<temp.length-1; ++i) {
				System.out.print(" " + temp[i] + " ");
			}
		}
	}
}

