import java.util.Scanner;
class CountVowelConsonant 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name or thing: ");
		String str = sc.nextLine().toLowerCase();
		
		int vowels = 0, consonants = 0;
		for(char ch : str.toCharArray())
		{
			if (Character.isLetter(ch)) 
			{
				 switch (ch) 
				{
					 case 'a':
						 
					 case 'e':
						
					 case 'i':
						
					 case 'o':
						
					 case 'u':
						 vowels++;
						 break;
					default:
						consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
		
	}
}

