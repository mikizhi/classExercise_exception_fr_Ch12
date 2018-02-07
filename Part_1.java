import java.util.Scanner;

public class Part_1 {

	public static void main(String[] args) {
		
		int sum = 0;
		while(true)
		{
			System.out.println("Please input a number: ");
			sum += new Scanner(System.in).nextInt();
			System.out.println("Sum = " + sum);
		}
		
		
	}

}


