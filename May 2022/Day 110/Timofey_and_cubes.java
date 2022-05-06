// Que link: https://codeforces.com/problemset/problem/764/B
// B. Timofey and cubes

//! TLE: this code is not working in java
import java.util.*;

public class Timofey_and_cubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l=0, r=n-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l+=2; r-=2;
        }

        // for(int i=0; i<n/2; i+=2){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-1-i] = temp;
        // }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


//! CPP
/* 
#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++){
        cin >> arr[i];
    }

    for (int i = 0; i < n / 2; i += 2){
        swap(arr[i], arr[n - 1 - i]);
    }

    for (int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    return 0;
}
*/