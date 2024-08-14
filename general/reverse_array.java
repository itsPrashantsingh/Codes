public class reverse_array {
    public static void main(String[] args) {
        int [] arr = {2,4,5,1,7,9};
        reverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void reverse(int [] arr){
        // int n = arr.length/2;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
            // n--;
        }
 
    }
    
}
