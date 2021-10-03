package plswork;

import java.util.Scanner;
public class SpeedofSound  { // start class
	public static void main(String[] args) { // main
	String medium; //defining medium air water steel
	double distance; //defining distance
	double time=0;
	
	
	Scanner keyboard = new Scanner(System.in); //get import from keyboard
	System.out.println("Please enter air, water, or steel"); //print out asking for medium 
	medium = keyboard.nextLine();
	System.out.println("Please enter distance");
	distance = keyboard.nextDouble();
	    keyboard.close();
	
	switch (medium)
	{//start switch
	case "air": 
		time=distance/1100;
		break;
	case "water":
		time=distance/4900;
		break;
	case "steel":
		time=distance/16400;
		break;
	default:
		System.out.print("Sorry, you must enter air,water,or steel");
		System.exit(0);
	}//emdswitch
	System.out.println("The total time is "+  time);
	
	}//end main
}//end class
	


		