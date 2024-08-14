package Sorting;

public class partitionarraybylastelement {


    public static void main(String[] args) {

        int [] arr = {7, 6, 9, 4, 11, 2, 5};
        partiton(arr, 0, arr.length-1);
        for(int i =  0;i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }


    }
    public static void partiton(int[] arr, int si, int ei){
        int n = arr.length;
        int pivot = arr[ei];
        int idx = 0;
        for(int i = 0; i<ei; i++){
            if(arr[i]<pivot){
                int t = arr[idx];
                arr[idx] = arr[i];
                arr[i] = t;
                idx++;
            }
        }
        int t = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = t;

    }
    
}
