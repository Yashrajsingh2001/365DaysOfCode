// Que link: https://codeforces.com/problemset/problem/1106/C
// C. Lunar New Year and Number Division


import java.util.*;

public class Lunar_New_Year_and_Number_Division{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        long sum=0;
        for(int i=0; i<n/2; i++){
            int cur = arr[i] + arr[n-i-1];
            sum += cur*cur;
        }
        System.out.println(sum);
	}
}