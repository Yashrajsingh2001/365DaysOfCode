import java.util.Arrays;

public class T8_ArraysClass {
    public static void main(String[] args) {
        int[] arr = {4,3,7,6,5,1,84,8,9,99,10};
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 6));
        
        for(int i : Arrays.copyOfRange(arr, 4, 7)){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
        
        //* and many more... 
    }
}
