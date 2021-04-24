package com.SuperMarket.SuperMarket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Spliterator;

import Entity.AvailableItem;





public class ReadOperation {
	public static void readUserFile() throws IOException{
		File file=new File("availableitems.txt");     
		FileReader fr=new FileReader(file); 
		BufferedReader br=new BufferedReader(fr); 
		StringBuffer sb=new StringBuffer();    
		String line;  
		AvailableItem itemarr[]=new AvailableItem[10];
		int count=0;
		while((line=br.readLine())!=null)  
		{  
		sb.append(line); 
		String arr[]=line.split(",");
		System.out.print(arr[2]);
		itemarr[count++]=new AvailableItem(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
		  
		}  
		fr.close();   
		for (int i = 0; i < itemarr.length; i++) {
			System.out.print("========== Item ============");
			System.out.print(itemarr[i].getItemName());
			System.out.print(itemarr[i].getQuentity());
			System.out.print(itemarr[i].getPrice());
		}
	
		  
		}

	public static void readAvaiableItems() {
		// TODO Auto-generated method stub
		
		
	}  	
	
}
