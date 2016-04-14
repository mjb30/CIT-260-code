import java.util.Scanner;

public class ExceptionTest025 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = keyboard.nextInt();
		
		System.out.print("Enter a number: ");
		int num2 = keyboard.nextInt();
		
		try{
			int result = num1/num2;
			System.out.print("Result: " + result);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide number by zero. Exiting!");
			//System.exit(0);
		}
		finally{
			System.out.println("In finally!");
		}
		System.out.println("test");

	}
}
