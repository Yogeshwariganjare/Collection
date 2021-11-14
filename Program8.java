package Collection;

import java.util.HashSet;

public class Program8 {

	
	
		public static void main(String[] args) {
			

			
			HashSet<Object> ho=new HashSet<>();
			ho.add(-5);
		    ho.add(100);
			ho.add(null);
			ho.add("Hi");
			ho.add(0);
			ho.add(75);
			ho.add(-80);
			ho.add(-5); //will be negleted for being duplicate
			ho.add("Bye");
			ho.add("3.14");
			
			System.out.println(ho);
		}
	}

		

	


