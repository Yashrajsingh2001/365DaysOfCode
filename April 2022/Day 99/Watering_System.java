// Que link: https://codeforces.com/problemset/problem/967/B
// B. Watering System


import java.util.*;

public class Watering_System{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
        int[] arr = new int[n];
        int sum=0, holeBlock=0;
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
            sum += arr[i];
		}
        Arrays.sort(arr, 1, n);

        for(int i=n-1; i>0; i--){
            if(arr[0]*A/sum >= B) break;
            sum -= arr[i];
            holeBlock++;
        }
        System.out.println(holeBlock);
	}
}