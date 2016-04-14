/**
 *  This program demonstrates the recursive fib method.
 */

public class FibNumbers
{
   /**
    *  main method 
    */

   public static void main(String[] args)
   {
      System.out.println("The first 10 numbers in the " +
                         "Fibonacci series are:");
                         
      for (int i = 0; i < 10; i++)
         System.out.print(fib(i) + " ");

      System.out.println();
   }
   
   /**
    *  The fib method returns the nth
    *  Fibonacci number. 
    */
   
   public static int fib(int n)
   {
      if (n == 0)
         return 0;
      else if (n == 1)
         return 1;
      else
         return fib(n - 1) + fib(n - 2);
   }
   
   public static int fib2(int n){
	   int prev1=0, prev2=1;
       for(int i=0; i<n; i++) {
           int savePrev1 = prev1;
           prev1 = prev2;
           prev2 = savePrev1 + prev2;
       }
       return prev1;
   }
}