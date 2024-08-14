package Sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int [] arr = {7, 6, 9, 4, 11, 2 };
        quickSort(arr, 0, arr.length-1);
       
        
        for(int i =  0;i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void quickSort(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }
        int le = partiton(arr, si, ei);
        quickSort(arr, si, le-1);
        quickSort(arr, le+1, ei);

        
    }

    public static int partiton(int[] arr, int si, int ei){
        // int n = arr.length;
        int pivot = arr[ei];
        int idx = si;
        for(int i = si; i<ei; i++){
            if(arr[i]<pivot){
                int t = arr[idx];
                arr[idx] = arr[i];
                arr[i] = t;
                System.out.println(Arrays.toString(arr));
                idx++;
            }
        }
        int t = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = t;
        return idx;

    }
    
}
