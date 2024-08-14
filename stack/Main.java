package stack;

import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int n = 1000;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40); 
        int p  = 2;

        p  = st.size()-p;
        st.insertElementAt(5, 2);

        insert(st, n, p);
     
            System.out.print(st);
        
        
    }
    public static void insert(Stack<Integer> st, int n, int p){
        if(p==0){
            st.push(n);
            return;
        }
       
        int x = st.pop();
        insert(st, n, p-1);
        st.push(x);
        

    }


}


