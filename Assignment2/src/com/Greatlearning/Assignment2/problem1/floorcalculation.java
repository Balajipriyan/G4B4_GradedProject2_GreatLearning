package com.Greatlearning.Assignment2.problem1;

import java.util.PriorityQueue;
public class floorcalculation 
{
	public void Building(int floors[],int noOffloor) 
	{
		System.out.println("The Order of Floors is as follow");

		PriorityQueue <Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		int[] tempfloor = new int[noOffloor];
		int max = noOffloor;
		System.out.println();
		for (int i = 0; i < noOffloor; i++) {

			System.out.println("Day: " + (i + 1));

			tempfloor[i] = floors[i];

			queue.add(tempfloor[i]);

			while (!queue.isEmpty() && queue.peek() == max) 
			{

				System.out.print(queue.poll() + " ");

				max--;
			}
			System.out.println();
		}

	}
}
