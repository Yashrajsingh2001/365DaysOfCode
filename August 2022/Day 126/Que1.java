// Que link: https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
// Counting elements in two arrays


class Solution{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n){
       // add your code here
        ArrayList<Integer> list = new  ArrayList<Integer>();
        Arrays.sort(arr2);
        for(int i=0; i<m; i++){
            int l=0, curr=arr1[i], r=n-1;
            while(l<=r){
                int mid= l + (r-l)/2;
                if(arr2[mid] <= curr) l=mid+1;
                else r=mid-1;
            }
            list.add(r+1);
        }
        return list;
    }
}