package student;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle
{
	public int car_slot=10;
	public int getCar_slot() {
		return car_slot;
	}
	public void setCar_slot(int car_slot) {
		this.car_slot = car_slot;
	}
	public int getBike_slot() {
		return bike_slot;
	}
	public void setBike_slot(int bike_slot) {
		this.bike_slot = bike_slot;
	}
	public int bike_slot=10;
abstract int assign_slot();

}
class car extends Vehicle
{
	int car_no;
	public int getCar_no() {
		return car_no;
	}

	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}

	car(int x)
	{
		car_no=x;
	}

	@Override
	int assign_slot() {
	if(car_slot>0)
	{
		car_slot--;
	System.out.println("Pls park your car at slot number:"+car_slot);
	return car_slot;
	}
	else
	{
		System.out.println("No parking slots available");
		return 0;
	}
	}
	
}
class Bike extends Vehicle
{
	int bike_no;
	public int getBike_no() {
		return bike_no;
	}

	public void setBike_no(int bike_no) {
		this.bike_no = bike_no;
	}

	Bike(int y)
	{
		bike_no=y;
	}

	@Override
	int assign_slot() {
	if(bike_slot>0)
	{
		bike_slot--;
	System.out.println("Pls park your bike at slot number:"+car_slot);
	return bike_slot;
	}
	else {
		System.out.println("No parking slots available");
		return 0;
	}
		
	}
	
}
public class parking_lot {

	public static void main(String[] args) {
		int choice;
		int veh_ch;
		Scanner sc=new Scanner(System.in);
		ArrayList<car> pc=new ArrayList<car>();
		ArrayList<Bike> pb=new ArrayList<Bike>();
		do
		{
			System.out.println("1.park 2.find vehicle 3.exit \n");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			if(choice==1)//parking scenario
			{
				//get the choice whether it is parking of car or bike
				System.out.println("1.car 2.bike \n");
				System.out.println("Enter your choice:");
				veh_ch=sc.nextInt();
				//if car
				if(veh_ch==1)
				{
					int car_number,c_slot;
					//create an object for car class
					System.out.println("Enter the car number:");
					car_number=sc.nextInt();
					car c=new car(car_number);
					//call assign slot 
					c_slot=c.assign_slot();
					//if slot value!=0 add to the array list
					if(c_slot!=0)
					{
						pc.add(c);
						
					}
				}
				//if bike
				else if(veh_ch==2)
				{
					int bike_number,b_slot;
					//create an object for car class
					System.out.println("Enter the bike number:");
					bike_number=sc.nextInt();
					Bike b=new Bike(bike_number);
					//call assign slot 
					b_slot=b.assign_slot();
					//if slot value!=0 add to the array list
					if(b_slot!=0)
					{
						pb.add(b);
						
					}
				}
				else
				break;
				}
			else if(choice==2)//display parked vehicle scenario
			{
				System.out.println("Parked car details:");
				System.out.println("car number ------ Slot number \n");
				for (car c_d : pc)
				{
					System.out.println(c_d.getCar_no()+"----"+c_d.getCar_slot());
				}
				System.out.println("Parked bike details:");
				System.out.println("bike number ------ Slot number \n");
				for (Bike b_d : pb)
				{
					System.out.println(b_d.getBike_no()+"----"+b_d.getBike_slot());
				}
			}
			
			else if(choice==3)//exit scenario
			{
				System.out.println("Thank you!");
			}
			else//valid option
			{
				System.out.println("1.park 2.find vehicle 3.unpark 4.exit \n");
				System.out.println("Enter your choice:");
				choice=sc.nextInt();
			}
			
		}while(choice!=3);
		
		// TODO Auto-generated method stub

	}

}
