package Sorting;
public class bubble_sort {
    public static void main(String[] args) {
        int [] arr = {3,2,4,8,1,1};
        int n = arr.length;
        int a = 0;
        while(n>0){
            for(int i = 0; i<n-1; i++){
                a = 0;
                if(arr[i]>arr[i+1]){
                    int c = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = c;
                    a = 1;
                }

            }
            if(a==0){break;}
            n--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
