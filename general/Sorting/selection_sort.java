package Sorting;
public class selection_sort {
    public static void main(String[] args) {
        int [] arr = {2,5,4,8,3,7,3};
        for(int i =0; i<arr.length; i++){
            int inx = Min_Value_Index(arr, i);
            int temp = arr[i];
            arr[i] = arr[inx];
            arr[inx] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
 
    }
    public static int Min_Value_Index(int [] arr, int i){
        int mini = i;
        for(int j = i+1; j<arr.length; j++){
            if(arr[j]<arr[mini]){
                mini = j;
            }
        }
        return mini;
    }
    
}
 