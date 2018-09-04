package com.stackroute.utilities;
import java.util.Scanner;

public class NumberSort {
  //int[] a;
	public static int[] sort(int[] a) {
	int temp;
	int n;
	int[] b = null;
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter no. of elements you want in array:");
	     n = input.nextInt();
	     
	 a = new int[n];
	 
		System.out.println("Enter all the numbers:");
         
         for (int i = 0; i < n; i++) 
            {
                a[i] = input.nextInt();
            }
         
            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    if (a[i] < a[j]) 
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.print("Non-increasing Order:");
            for (int i = 0; i < n - 1; i++) 
            {
            	
                System.out.print(a[i] + ",");
                
            }
            
           System.out.print(a[n - 1]);
           
           return a;
            
        
    }
}
