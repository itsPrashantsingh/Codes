package Sorting;

import java.util.ArrayList;

public class mergesortx {
    public static void main(String[] args) {
        int [] arr = {7, 6, 9, 4, 11, 5, 2};  

        
    }

    public static int[] merge(int[] arr, int si, int ei){
        if(si==ei){
            int a[] = new int[1];
            a[0] = arr[si];
            return a;
        }
        int mid = (si+ei)/2;
        int ans1[] = merge(arr, si, mid);
        int ans2[] = merge(arr,mid+1,ei);
        return mergearr(ans1, ans2);
    }
    
    public static int [] mergearr(int[] l1, int[] l2){
        int i = 0;
        int j = 0;
        int n = 0;
       
        
        int anx[] = new int[l1.length+l2.length];
        int idx = 0;
        

        while(i<l1.length && j<l2.length){
            if(l1[i]>=l2[j]){
                anx[idx] = l2[j];
                idx++;
                j++;

            }
            else{
                anx[idx] = l1[i];
                i++;
                idx++;
            }

        }
        while(i<l1.length){
            anx[idx] = l1[i];
            i++;
            idx++;
        }
        while(j<l2.length){
            anx[idx] = l2[j];
            j++;
            idx++;
        }
        return anx;
       

    }

    
}
