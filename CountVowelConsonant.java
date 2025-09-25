import java.util.Scanner;
class CountVowelConsonant 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name or thing: ");
		String str = sc.nextLine().toLowerCase();
		
		int vowels = 0, consonants = 0;
		/* if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U')
		{
			count++;
			System.out.println("Vowel count: " +count);
		}
		if(str == 'b' || str == 'c' || str == 'd' || str == 'f' || str == 'g' || str == 'h' || str == 'j' || str == 'k' || str == 'l' || str == 'm' ||	str == 'n' || str == 'p' || str == 'q' || str == 'r' || str == 's' || str == 't' || str == 'v' || str == 'w' || str == 'x' || str == 'y' || str == 'z' || str == 'B' || str == 'C' || str == 'D' || str == 'F' || str == 'G' || str == 'H' || str == 'J' || str == 'K' || str == 'L' || str == 'M' ||	str == 'N' || str == 'P' || str == 'Q' || str == 'R' || str == 'S' || str == 'T' || str == 'V' || str == 'W' || str == 'X' || str == 'Y' || str == 'Z' )
		{
			count++;
			System.out.println("Consonant count is: " +count);
		}
		*/
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
