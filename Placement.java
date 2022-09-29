//PROGRAM TO FIND HIGHEST PLACEMENT IN A COLLEGE...........

import java.util.*;
class Placement
{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students placed in CSE");
		a=sc.nextInt();
		System.out.println("enter the number of students placed in ECE");
		b=sc.nextInt();
		System.out.println("enter the number of students places in MECH");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("highest placement");
			System.out.println("CSE");
		}
		else if(a<0||b<0||c<0)
		{
			System.out.println("input is invalid");
		}
		else if(b>a&&b>c)
		{
			System.out.println("highest placement");
			System.out.println("ECE");
		}
		else if(a==b&&b==c&&c==a)
		{
			System.out.println("none of the department has got the highest placement");
		}
		else if(a==b)
		{
			System.out.println("Highest placement");
			System.out.println("CSE");
			System.out.println("ECE");
		}
		else if(a==c)
		{
			System.out.println("highest placement");
			System.out.println("CSE");
			System.out.println("MECH");
		}
		else{
			System.out.println("highest placement");
			System.out.println("ECE");
			System.out.println("MECH");
		}
	}
}