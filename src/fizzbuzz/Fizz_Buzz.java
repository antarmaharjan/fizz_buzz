package fizzbuzz;

public class Fizz_Buzz {
	/**
	 * This is a project to print out the no from 1 to 100 but prints 'Fizz'if the no is multiplied by 3
	 *  and 'Buzz' if the no. is multiplied by 5. Again if the no is multiplied by both 3 and 5, then prints 'FizzBuzz'.
	 * The details (user requirements) are below: 
	 * 
	 * @author antarmaharjan
	  
	 ***/

	public static void main(String[] args) {
		for (int i=1; i<=100; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0){
				System.out.println("Fizz");
			}
			if (i % 5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
		
	}

}
