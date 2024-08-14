import java.util.Scanner;

public class reverse_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        reverse_r(arr, a, b);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void reverse_r(int [] arr, int a, int b){
        // int n = arr.length/2;
        int i = a;
        int j = b;
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
