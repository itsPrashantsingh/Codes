package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class dfs {
   
    boolean check = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
       

        for(int i = 0; i<edges.length; i++){
            int[] arr = edges[i];
            if(hm.containsKey(arr[0])){
                hm.get(arr[0]).add(arr[1]);
            }
            else{
                ArrayList<Integer> ll = new ArrayList<Integer>();
                ll.add(arr[1]);
                hm.put(arr[0], ll);
            } 

            if(hm.containsKey(arr[1])){
                hm.get(arr[1]).add(arr[0]);
            }
            else{
                ArrayList<Integer> ll = new ArrayList<Integer>();
                ll.add(arr[0]);
                hm.put(arr[1], ll);
            } 
        }
        Set<Integer> st = new HashSet<>();
        gen (hm, source , destination, st);

        // System.out.println(hm);
        
        return check;


    }
    public void gen(HashMap<Integer, ArrayList<Integer>> hm, int source, int destination, Set<Integer> st){
           
           if(source == destination){
                check = true;
                return;
           }
            if(!hm.containsKey(source)){
                return ;
            }
            if(st.contains(source)){
                return;
            }

            
            for(int i= 0; i<hm.get(source).size(); i++){
                st.add(source);
                gen(hm, hm.get(source).get(i), destination, st);
                // st.remove(st.size()-1);
            }
           
           return ;
    }
}
    

