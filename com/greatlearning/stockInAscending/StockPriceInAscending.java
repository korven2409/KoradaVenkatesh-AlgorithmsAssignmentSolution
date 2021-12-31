package com.greatlearning.stockInAscending;

public class StockPriceInAscending {
	public void sortAscending(double arr[],int lb,int ub)
	{
		int mid;
		if(lb<ub)
		{
			mid = (lb+ub)/2;
			sortAscending(arr,lb,mid);
			sortAscending(arr,mid+1,ub);
			sortMerge(arr,lb,mid,ub);
		}
	}
	public void sortMerge(double arr[],int l,int mid,int r)
	{
		int i,j,k;
		i=l;
		j=mid+1;
		k=l;
		double brr[] = new double[arr.length];
		while(i<=mid && j<=r)
		{
			if(arr[i]<=arr[j])
			{
				brr[k] = arr[i];
				i++;
			}
			else
			{
				brr[k] = arr[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=r)
			{
				brr[k] = arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				brr[k] = arr[i];
				i++;
				k++;
			}
		}
		for(int m=l;m<=r;m++)
		{
			arr[m] = brr[m];
		}
	}
}
