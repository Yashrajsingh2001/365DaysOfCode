// Que link: https://codeforces.com/problemset/problem/1204/B
// B. Mislove Has Lost an Array


import java.util.*;

public class Mislove_Has_Lost_an_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		
        int least=0, most=0, z=1;
        
        // for least
        for(int i=0; i<l; i++){
            least += z;
            z*=2;
        }
        least += n-l;

        // for most
        z=1;
        for(int i=0; i<r; i++){
            most += z;
            z*=2;
        }
        most += (n-r)*(z/2);

        System.out.println(least+" "+most);

	}
}