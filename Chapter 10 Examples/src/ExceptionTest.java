import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = keyboard.nextInt();
		
		System.out.print("Enter a number: ");
		int num2 = keyboard.nextInt();
		
		try{
			int result = num1/num2;
			System.out.println("Result is: " + result);
		}catch(ArithmeticException e){
			System.out.println("Sorry -- computers do not divide by zero. Quitting.");
			//System.exit(0);
		}
		System.out.println("test");
	}
}
