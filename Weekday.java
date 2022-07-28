//program to display name of weekday
import java.util.Scanner;
public class Weekday
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter weekday number:");
		int weekday = Scanner.nextInt();
		if(weekday==1)
		{
			System.out.println("MONDAY");
		}
		else if(weekday==2)
		{
			System.out.println("TUESDAY");
		}
		else if(weekday==3)
		{
			System.out.println("WEDNESDAY");
		}
		else if(weekday==4)
		{
			System.out.println("THURSDAY");
		}
		else if(weekday==5)
		{
			System.out.println("FRIDAY");
		}
		else if(weekday==6)
		{
			System.out.println("SATURDAY");
		}
		else if(weekday==7)
		{
			System.out.println("SUNDAY");
		}
	}
}