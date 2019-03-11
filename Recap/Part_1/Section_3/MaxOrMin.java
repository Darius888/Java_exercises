public class MaxOrMin {
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Java smallest int is : " + Integer.MIN_VALUE );
			System.exit(0);
		} else {	
	
			int max = Integer.parseInt(args[0]);

			for (int i = 0; i < args.length; i++) {

			if (Integer.parseInt(args[i]) > max) {
				max=Integer.parseInt(args[i]);			
				}
			}
		

			System.out.println(max);

		}

	}
}
