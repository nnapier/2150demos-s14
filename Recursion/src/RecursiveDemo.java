import java.util.Scanner;


public class RecursiveDemo
{
	public static int factorial(int n)
	{
		if(n < 0)
		{
			throw new IllegalArgumentException("Number can't be less than 0!");
		}
		if(n == 0 || n == 1)
		{
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static int fib(int n)
	{
		if(n <= 0)
		{
			throw new IllegalArgumentException("Number can't be less than 0!");
		}
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static int function1(int n)
	{
		if(n <= 0)
		{
			throw new IllegalArgumentException("Number can't be less than 0!");
		}
		if(n == 1)
		{
			return 6;
		}
		return function1(n - 1) + 6;
	}
	
	public static void main(String[] args)
	{
		/*System.out.println("4! is: " + factorial(4));
		System.out.println("6! is: " + factorial(6));
		try
		{
			System.out.println("-5! is: " + factorial(-1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("10! is: " + factorial(10));
		System.out.println("15! is: " + factorial(15));*/
		
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("Fib(4) is: " + fib(4));
		System.out.println("Fib(6) is: " + fib(6));
		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		for(int i = 1; i <= num; i++)
		{
			System.out.println("All the Fibonacci numbers are: " + fib(i));
		}
		System.out.println("Fib(40) is: " + fib(40));*/
		
		System.out.println("Function(2) is: " + function1(2));
		System.out.println("Function(4) is: " + function1(4));
		System.out.println("Function(7) is: " + function1(7));
	}

}
