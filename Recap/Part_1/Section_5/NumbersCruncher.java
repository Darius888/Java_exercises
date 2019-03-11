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
*/		/*if (args.length == 0 || !args.equals("max") || !args.equals("sum")) {
			System.err.println("GG");			
		} else*/ if (args[0].equals("sum")) {
			int temp=0;
			temp=cruncher.sum();
			System.out.println(temp);
		} else if (args[0].equals("max")) {
			int temp=0;
			temp=cruncher.max();
			System.out.println(temp);
		}
	}
}

