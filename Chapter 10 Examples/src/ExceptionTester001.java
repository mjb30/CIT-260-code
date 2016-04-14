import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		try{
			System.out.print("Enter a number");
			int num1 = keyboard.nextInt();
			System.out.print("Enter a number"); 
			int num2 = keyboard.nextInt();
			
			int result = num1/num2;
			System.out.println("Result is: " + result);
		}catch(ArithmeticException e){
			System.out.println("Hey - cannot divide by zero! Exiting!");
			System.exit(0);
		}catch(InputMismatchException e){
			System.out.println("You need to enter a number!");
		}
		System.out.println("Here!");
	}

}
