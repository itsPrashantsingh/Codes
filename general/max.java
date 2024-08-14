import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(maxi(arr));
        
  
    }
    // public static int maxi(int [] arr){
    //     int x = arr[0];
    //     for(int i = 1; i<arr.length; i++){
    //         if (x<arr[i]){
    //             x = arr[i];
    //         }
    //     }
    //     return x;
    // }

        public static int maxi(int [] arr) {
            int m = Integer.MIN_VALUE;//-2^31
            for(int i = 0; i<arr.length; i++){
                m = Math.max(arr[i], m);
            }
            return m;

        }


    
}
 