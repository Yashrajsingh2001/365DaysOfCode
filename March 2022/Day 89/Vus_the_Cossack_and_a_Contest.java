// Que link: https://codeforces.com/problemset/problem/1186/A
// A. Vus the Cossack and a Contest


import java.util.*;

public class Vus_the_Cossack_and_a_Contest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pen = sc.nextInt();
        int nb = sc.nextInt();

        System.out.println(num<=pen && num<=nb ? "Yes" : "No");
    }
}