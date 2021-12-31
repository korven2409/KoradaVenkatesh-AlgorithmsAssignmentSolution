package com.greatlearning.stockSearch;

public class SearchSpecificStock {
	public int search(double arr[],double key)
	{
		int i,flag=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
			}
			
		}
		return flag;
	}
}
