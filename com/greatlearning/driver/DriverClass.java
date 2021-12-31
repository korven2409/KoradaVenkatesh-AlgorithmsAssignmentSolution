package com.greatlearning.driver;
import com.greatlearning.stockInAscending.*;
import com.greatlearning.stockInDescending.*;
import com.greatlearning.stockSearch.*;
import java.util.Scanner;
public class DriverClass {
	public static void main(String args[])
	{
		int i,size,noOfCompanies;
		boolean roseornot;
		int totalrose=0,totalnotrose=0;
		double key;
		int choice=999;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of companies ");
		noOfCompanies = sc.nextInt();
		double stockPrice[] = new double[noOfCompanies];
		for(i=0;i<noOfCompanies;i++)
		{
			System.out.println("Enter current stock price of the company "+(i+1));
			stockPrice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			roseornot = sc.nextBoolean();
			if(roseornot==true)
			{
				totalrose++;
			}
			else
			{
				totalnotrose++;
			}
		}
		while(choice!=0)
		{
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("1. Display the companies stock prices in ascending order\n2. Display the companies stock prices in descending order\n3. Display the total no of companies for which stock prices rose today\n4. Display the total no of companies for which stock prices declined today\n5. Search a specific stock price\n6. press 0 to exit");
			System.out.println("-------------------------------------");
			choice = sc.nextInt();
			if(choice==1)
			{
				StockPriceInAscending obj1 = new StockPriceInAscending();
//				System.out.println("Before ascending sorting");
//				for(int x=0;x<stockPrice.length;x++)
//				{
//					System.out.println(stockPrice[x]);
//				}
				obj1.sortAscending(stockPrice,0,stockPrice.length-1);
				System.out.println("Stock prices in ascending order are:");
				for(int x=0;x<stockPrice.length;x++)
				{
					System.out.println(stockPrice[x]);
				}
			}
			else if(choice==2)
			{
				StockPriceInDescending obj2 = new StockPriceInDescending();
//				System.out.println("Before Descending sorting");
//				for(int x=0;x<stockPrice.length;x++)
//				{
//					System.out.println(stockPrice[x]);
//				}
				obj2.sortDescending(stockPrice,0,stockPrice.length-1);
				System.out.println("Stock prices in descending order are:");
				for(int x=0;x<stockPrice.length;x++)
				{
					System.out.println(stockPrice[x]);
				}
			}
			else if(choice==3)
			{
				System.out.println("Total no of companies whose stock price rose today : "+totalrose);
			}
			else if(choice==4)
			{
				System.out.println("Total no of companies whose stock price declined today : "+totalnotrose);
			}
			else if(choice==5)
			{
				System.out.println("enter the key value");
				key = sc.nextDouble();
				SearchSpecificStock obj3 = new SearchSpecificStock();
				int there = obj3.search(stockPrice, key);
				if(there==1)
				{
					System.out.println("Stock of value "+key+" is present");
				}
				else
				{
//					System.out.println("Stock of value "+key+" is not present");
					System.out.println("Value not found");
				}
			}
		}
		System.out.println("Exited sucessfully");
		
	}
}
