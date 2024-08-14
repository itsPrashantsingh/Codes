// array is non primitive datatype and saved in heap memory while primitive goes to stack memory.
//java is call by valuee!

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];//arr-> reference memory
        int[] others = arr;
        System.out.println(arr);
        System.out.println(others);
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Display(arr);

    }
    public static void Display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}