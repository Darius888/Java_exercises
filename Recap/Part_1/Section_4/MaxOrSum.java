public class MaxOrSum {

	public static void main(String[] args) {
		if (args.length == 0 || !args.equals("max") || !args.equals("sum")) {
			System.err.println("GG");			
			
	
		} else {	
			if (args[0].equals("sum")) {
				int sum = 0;
				for (int i = 1; i < args.length; i++) {
					sum += Integer.parseInt(args[i]);
				}
				System.out.println(sum);
			} else if (args[0].equals("max")) {
			
				int max = Integer.parseInt(args[1]);
	
				for (int i = 1; i < args.length; i++) {

				if (Integer.parseInt(args[i]) > max) {
					max=Integer.parseInt(args[i]);			
					}
				}
				System.out.println(max);
			}  
		}
		
	}

}
