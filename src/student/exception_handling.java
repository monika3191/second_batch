package student;

import java.util.Scanner;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];//size 5
		System.out.println(a[10]);
		
		String s="dfg";
		//System.out.println("Enter x");
		//int x=sc.nextInt();
		int x=Integer.parseInt(s);
		System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Size is 5");
		}
	    catch(NumberFormatException e)
		{
	    	System.out.println("Please enter a valid string");
	    	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter value apart from 0");
		}
		

	}

}
