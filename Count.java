//to count the vowels and throw checked exception
import java.util.*;
class Count
{
	for(char ch:charArr)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
		try {
			if(ch=='x') {
				System.out.println("Checked Exception");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Count c=new Count();
		char[] CharArray={'a','b','c','d','e','x'};
		int countValueOfVowel=obj.countVowels(CharArray);
		System.out.println(countValueOfVowel);
	}	
}
