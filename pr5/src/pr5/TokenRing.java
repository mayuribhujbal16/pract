package pr5;

import java.util.Scanner;

public class TokenRing {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of processor: ");
		int n=sc.nextInt();
		
		int choice;
		int token = 0;
		int req;
		
		do {
			System.out.println("\nEnter process requesting critical section: ");
			req= sc.nextInt();
			
			System.out.println("\nToken passing: ");
		
		while(token != req){
			
			System.out.println("Token passed from process" + token + "to process" + ((token+1) %n));
			token = (token+1) % n;
			
		}
		
		System.out.println("\nProcess" + req + "enters Critical Section" );
		System.out.println("Process" + req + "exist Critical Section");
		
		token=(token+1) % n;
		
		System.out.println("\nDo you want to continue?(1/0): ");
		choice = sc.nextInt();

	}while(choice==1);sc.close();
	
	}

}
