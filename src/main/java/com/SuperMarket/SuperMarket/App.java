package com.SuperMarket.SuperMarket;

import java.io.IOException;
import java.util.Scanner;

import com.SuperMarket.SuperMarket.Menu.Menu;



public class App 
{
    public static void main( String[] args ) throws IOException
    {
    Scanner sc=new Scanner(System.in);
    	int choice = 0;
	
			do {
				Menu.displayMenu();

				System.out.println("Enter your choice:");

			
				choice = sc.nextInt();
				

				switch (choice) {
				case 1:ReadOperation.readUserFile();
							
			
					break;
				case 2: System.out.println("Successful exit");
					break;
				
				default: System.out.println("Wrong choice");
				break;
				}
			}while(choice!=4);

			sc.close();		
    }

	
}
