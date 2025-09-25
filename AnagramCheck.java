import java.util.Arrays;
class AnagramCheck 
{
	public static void main(String[] args) 
	{
		//declaring the variable
		String str1 = "Listen";
		String str2 = "Silent";
		
		//convert into LowerCase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//converting into the char
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		//sort the arr1 and arr2
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("It is an Anagram ");
		else
			System.out.println("It is not an Anagram");
		
	}
}
