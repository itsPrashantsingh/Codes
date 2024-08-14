package Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int [] arr = {1,3,2,3,4,7,5,9,3};
        for(int i = 1; i<arr.length; i++){
            insert_element(arr, i);
        }
        
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void insert_element(int [] arr, int i){
        int j = i-1;
        int item = arr[i];
        while(j>=0 && arr[j]>item){
            arr[j+1]  = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
    
}
