import java.util.InputMismatchException;
import java.util.Scanner;

public class Part_2 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		while(count < 10)
		{
			System.out.println(“Please input a number: ”);
			
			try
			{
				sum += new Scanner(System.in).nextInt();
				count ++;
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input, please input a number: ”);
			}
			System.out.println("Sum = " + sum);
		}

	}

}
