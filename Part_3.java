import java.util.InputMismatchException;
import java.util.Scanner;

public class Part_3 {

	public static void main(String[] args) {
		
		
		System.out.println("please enter how many numbers you gonna input: ");
		int count = new Scanner(System.in).nextInt();
		int[] input = new int[count];
		
		Solution service = new Solution();
		try{
			int total = service.sum(input);
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input");
		}

	}

}


class Solution{
	int sum(int[] input) throws InputMismatchException
	{
		int sum = 0;
		for(int i = 0; i< input.length;)
		{
			System.out.println("Please input a number");
			
			try
			{
				sum += new Scanner(System.in).nextInt();
				i ++;
			}
			catch(InputMismatchException e){
				throw e;
			}
			System.out.println("Sum = " + sum);
		}
		return sum;
	}
}