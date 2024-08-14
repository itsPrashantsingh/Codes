package Sorting;
import java.util.Scanner;
public class q {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = 0;
        int i = 0;
        int j = 0;
        int z  = n;
        int y = m;
        while(k<=((y*z)-1)){
            
            while((i<n && (k<=((y*z)-1)) ) ){
                System.out.print(arr[i][j]+" ");
                i++;
                k++;
            }
            j++;
            i--;
            while(j<m&& (k<=((y*z)-1)) ){
                System.out.print(arr[i][j]+" ");
                j++;
                k++;
            }
            i--;
            j--;
            while(i>=0&& (k<=((y*z)-1)) ){
                System.out.print(arr[i][j]+" ");
                i--;
                k++;

            }
            j--;
            i++;
            while(j>0&& (k<=((y*z)-1)) ){
                System.out.print(arr[i][j]+" ");
                j--;
                k++;
            }
            n--;
            m--;
            j++;
            i++;
            System.out.print("*"+k+"* ");

        }
       

        




    }
}