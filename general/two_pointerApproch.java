import java.util.Arrays;

public class two_pointerApproch {
    public static void main(String[] args) {
        int [] arr  = {5, 10, 15, 20, 25, 45, 50, 60, 100};
        Arrays.sort(arr);
        int t = 60;
        int i = 0;
        int j = arr.length-1;
        int ans[] = new int[2];
        while(i<j){
            if(arr[i]+arr[j]==t){
                ans[0] = i;
                ans[1] = j;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>t){
                j--;
            }
            else if(arr[i]+arr[j]<t){
                i++;
            }
        }
    }
    
}
