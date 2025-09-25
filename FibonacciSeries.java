import java.util.Scanner;
class  FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: "); //here fib series are 0 1 1 2 3 5....
		int n = sc.nextInt(); // here entering the place of the fib series now, that place is 5
		
		System.out.println(fib(n)); //answer will print here.
	}
		public static int fib(int n) // here we are assigning the n value
		{
			if(n == 0 || n == 1)
					return 0;
			if(n ==2)
					return 1;
			return fib(n-1) + fib(n-2);
		}
}
