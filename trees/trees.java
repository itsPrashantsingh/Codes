package trees;

import java.util.Scanner;
import java.util.Stack;

public class trees {

    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

        
    Scanner sc = new Scanner(System.in);
        
        private Node root = null;
        public void createTree(){
            root = createTree(this.root);
            display2(root);
        }
        private Node createTree(Node root){
            int data = sc.nextInt();
            Node n = new Node(data);
            boolean hls = sc.nextBoolean();
            if(hls){
                n.left = createTree(n);
            }
            boolean hrs = sc.nextBoolean();
            if(hrs){
                n.right = createTree(n);
            }

            return n;

        }
        private void display(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.val);
            display(root.left);
            display(root.right);
        }
        private void display2(Node root){
           Stack<Node> st = new Stack<>();
           st.push(root);
           while(!st.isEmpty()){
                Node curr = st.pop();
                System.out.println(curr.val);
                
                if(curr.right!=null)
                    st.push(curr.right);
                if(curr.left!=null)
                    st.push(curr.right);

                    
           }
        }
        

    }

    

    

