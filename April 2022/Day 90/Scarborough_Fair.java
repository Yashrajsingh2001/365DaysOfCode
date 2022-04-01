// Que link: https://codeforces.com/problemset/problem/897/A

import java.util.*;

// Method 1:
public class Scarborough_Fair{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String st = sc.next();
		
		while(t-- >0){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    String c1 = sc.next();
		    String c2 = sc.next();
		    
		    st = st.substring(0, l-1) + st.substring(l-1, r).replaceAll(c1, c2) + st.substring(r);
		}
		System.out.println(st);
	}
}


// Method 2:
class Scarborough_Fair_method2{
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
        int n = scan.nextInt();
        int m = scan.nextInt();
        char arr[] = scan.next().toCharArray();
        
        while(m-- > 0){
            int l = scan.nextInt();
            int r = scan.nextInt();
            char c1 = scan.next().charAt(0);
            char c2 = scan.next().charAt(0);
            
            for(int i = l-1; i < r; i++){
                if(arr[i] == c1){
                    arr[i] = c2;
                }
            }
        }
        System.out.println(arr);
    }
}