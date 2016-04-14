import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionTester {

	public static void main(String[] args) {

		Scanner keyboard =  new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		
		/*int[ ] array1 = new int[ 3 ];

		try
		{
			System.out.println("Before array print");
			System.out.println(array1[3]);
			System.out.println("After array print");
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("index out of bounds!!! " + error.getMessage());
		}

		System.out.println("Getting on with life");*/
		
		/*int number;
		String str = "5";
		
		try
		{
		  number = Integer.parseInt(str);
		}
		catch (IllegalArgumentException e)
		{
		  System.out.println("Bad number format.");
		}
		catch (NumberFormatException e) // ERROR!!!
		{
		  System.out.println(str + " is not a number.");
		}
*/
	}

}
