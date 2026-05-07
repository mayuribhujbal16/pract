package pr4;

import java.util.Scanner;

public class Berkeley {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of nodes: ");
		int n = sc.nextInt();
		
		int[] time= new int[n];
		int sum =0;
		
		for(int i=0; i<n; i++) 
		{
			System.out.println("Enter time for node" + (i+1) + ";");
			time[i] = sc.nextInt();
			sum+= time[i];
			
		}
		
		int avg = sum/n;
		
		System.out.println("\nAverage Time: "+avg);
		
		for(int i =0; i<n; i++)
		{
			int adjustment = avg - time[i];
			System.out.println("Node "+ (i+1) + "adjustment: "+"adjust");
		}
		
		sc.close();

	}

}
