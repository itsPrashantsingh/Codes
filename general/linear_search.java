import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = {1,2,3,4,5};
        System.out.println(search(n, arr));
        
  
    }
    
    public static int search(int a, int [] arr){
        for(int i = 0; i<arr.length; i++){
            if (a == arr[i]){
                return i;
            }
        }
        return -1;

    }
    
}
