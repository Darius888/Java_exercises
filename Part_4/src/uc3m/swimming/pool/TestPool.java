package uc3m.swimming.pool;

import java.util.ArrayList;

public class TestPool {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//String input = args[0];
	
		
		
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(new Person("01100000­A"));
		array.add(new Person("01100000­B"));
		array.add(new Staff("01100000­C", 55));
		array.add(new Staff("01100000­D", 55));
		array.add(new Professor("01100000­E", 100 , "mathematics"));
		array.add(new Professor("01100000­F", 200 , "geography"));
		array.add(new Student("01100000­G", "777777"));
		array.add(new Student("01100000H", "888888"));
		array.add(new Intern("01100000­J", "999999" , 300));
		array.add(new Intern("01100000K", "101010", 400));
		array.add(new Tenured("01100000L", "physics"));
		array.add(new Tenured("01100000M", "computer_science"));
		
		if (args.length == 0 )
		{
			for(int j=0; j<array.size(); ++j)
			{
				System.out.println(array.get(j));
			}
		}
		
		
		for (int i = 0; i < args.length ; ++i)
		{
			if (args[0].equals("-s"))
			{
				for(int g=0; g<array.size(); ++g)
				{
					
					System.out.println(array.get(g).toStringDni());
				}
			}
		}
	}
}
