package student;
import java.util.*;

public class revise {
	revise()//once when the constructor
	{
		System.out.println("constructor");
	}
	public int sum(int x, int y)
	{return (x+y);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the value of a");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//System.out.println(a+b);
		//array- set of simalar data
		int a[]=new int[5];
		a[0]=23;
		a[1]=56;
		a[2]=90;
		a[3]=67;
		a[4]=56;
		for(int i=0;i<5;i++)
		{
			//System.out.println(a[i]);				
		}
revise r=new revise();
	int ch=r.sum(34,67);
	System.out.println(ch);
}}

	
	
