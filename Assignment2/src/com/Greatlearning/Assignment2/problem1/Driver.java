package com.Greatlearning.Assignment2.problem1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total No of Building");
		int noOffloor = sc.nextInt();
		int floor[] = new int [noOffloor];
		for(int i =0;i<noOffloor;i++) 
		{
			System.out.println("Enter the floor size on Day:"+(i+1));
			floor[i]=sc.nextInt();
		}
		floorcalculation calc = new floorcalculation();
		calc.Building(floor, noOffloor);
		sc.close();
	}

}
