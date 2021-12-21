// Que LINK: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Que1 {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n){
        int max = arr[0];
        for(int i=1; i<n; i++){
            max = (max < arr[i]) ? arr[i] : max;
        }
        return max;
    }
}