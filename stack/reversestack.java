package stack;
import java.util.*;;

public class reversestack {
  
        public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
      
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40); 
        System.out.println(st);
       
        reverse(st, 0); 

     
       System.out.println(st);
            
            
        }
        public static void reverse(Stack<Integer> st, int i){
            if(i>=st.size()){
                return;
            }
        
            reverse(st, i+1);
            int x = st.pop();
            // System.out.println(x);
            // st.insertElementAt(x, 0);
            return;


        }
    
    
}
