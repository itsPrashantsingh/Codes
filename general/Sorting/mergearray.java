package Sorting;

import java.util.ArrayList;

public class mergearray {
    public static void main(String[] args) {
        int[] l1 = {2, 3, 5, 7, 11, 15};
        int[] l2 = {1,6,7,11,13,19,25,28,30};
        int i = 0;
        int j = 0;
        ArrayList<Integer> ll = new ArrayList<>();
        

        while(i<l1.length && j<l2.length){
            if(l1[i]>=l2[j]){
                ll.add(l2[j]);
                j++;

            }
            else{
                ll.add(l1[i]);
                i++;
            }

        }
        while(i<l1.length){
            ll.add(l1[i]);
            i++;
        }
        while(j<l2.length){
            ll.add(l2[j]);
            j++;
        }
        System.out.println(ll);

    }
    
}
