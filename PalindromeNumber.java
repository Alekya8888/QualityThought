import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt(); //121
		
		int temp = n; //121
		
		int rem, rev = 0;
		while(n > 0) //121 12 1 0
		{
			rem = n % 10;	// 121 % 10 = 1, 12 % 10 = 2 1 %10 = 1
			rev = rev * 10 + rem; // 1 , 1*10+2= 12 12 * 10 +1 = 120+1 = 121
			n = n/10; //121/10 = 12 , 12/10= 1 1/10 =0
		}
		if(temp == rev) //121 =1 
			System.out.println("It is a PalindromeNumber");
		else
			System.out.println("It is not a PalindromeNumber");
	}
}
