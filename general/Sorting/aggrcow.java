package Sorting;

import java.util.Arrays;

public class aggrcow {
    public static void main(String[] args) {
        int[] stall = {1,2,8,4,9};
        int noc = 3;
        Arrays.sort(stall);
        System.out.println(largest_distance(stall, noc));
    }
    
    public static int largest_distance(int[] stall, int noc) {
        int lo = stall[0];
        int hi = stall[stall.length-1];
        int ans = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isitpossible(stall, noc, mid)){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        
        
    }
    
}
