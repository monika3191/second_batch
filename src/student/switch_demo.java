package student;

import java.util.Scanner;

public class switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int choice;
float b;
System.out.println("Enter your choice:");
choice=sc.nextInt();
switch(choice)
{
case 1:
	System.out.println("Choice is one");
break;
case 2:
	System.out.println("choice is two");
	break;
case 23:
	System.out.println("choice is 23");
break;
default:
	System.out.println("Give a valid number");
	
}

	}

}
