// Que link: https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
// Print all the duplicates in the input string


import java.util.*;

public class All_the_duplicates{

    private static void duplicates(String str){
        int[] arr = new int[256];
        for(char ch : str.toCharArray()){
            arr[ch]++;
        }

        for(int i=0; i<256; i++){
            if(arr[i]>1)
                System.out.println("index " +i+ " : "+(char)(i)+" occurs "+arr[i]+ " times");
        }
    }

    private static void duplicates_Map(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0)+1);

        for (Map.Entry mapElement : map.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = (int)mapElement.getValue();
 
            if (value > 1)
                System.out.println(key + ", count = " + value);
        }
    }

    public static void main(String[] args) {
        String str = "abcAABaTHthhukavnuyytgggHDDDSEDD.,01999{]|{]|{]|{]|??????";

        duplicates(str);
        System.out.println("\n\n\n");
        duplicates_Map(str);
    }
}