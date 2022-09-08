//to find the longest words in test file
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Words{
	public static void main(String args[]) throws FileNotFoundException{
		new Words().findLongestWords();
	}
	public String findLongestWords() throws FileNotFoundException{
		String Longest_word=" ";
		String current;
		Scanner sc=new Scanner(new File("E:\\d.txt"));
	
    	while(sc.hasNext()){
			current=sc.next();
			if(current.length() > Longest_word.length()){
				Longest_word = current;
			}
		}
		System.out.println("\n"+Longest_word+"\n");
		return Longest_word;
	}
}