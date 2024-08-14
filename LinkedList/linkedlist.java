package LinkedList;

public class linkedlist {
    public class linked_list {
        node head;
        node tail;
        int size;
        class node{
            int data;
            node next;
            node(int val){
                data=val;
                next=null;
            }
        }
    //	o(1)
        public void add_at_last(int val) {
            node n=new node(val);
            if(size==0) {
                head=n;
                tail=n;
                size++;
            }else{
                tail.next=n;
                tail=n;
                size++;
            }
        }
        public void remove_first() {


            
        }
    //	o(size)
        public void add_at_any_pos(int pos,int val) {
            if(pos==0) {
                add_at_first(val);
            }else if(pos==size) {
                add_at_last(val);
            }else {
                node n=new node(val);
                node temp=head;
                for(int i=0;i<pos-1;i++) {
                    temp=temp.next; 
                }
                node x=temp.next;
                temp.next=n;
                n.next=x;
                size++;	
            }
            
        }
    //	o(1)
        public void add_at_first(int val) {
            node n=new node(val);
            if(size==0) {
                head=n;
                tail=n;
                size++;
            }else {
                n.next=head;
                head=n;
                size++;
            }
        }
    //	o(size)
        public void print() {
            node temp=head;
            while(temp!=null) {
                System.out.print(temp.data+"->"); 
                temp=temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            linked_list ll=new linked_list();
            ll.add_at_first(10);
            ll.add_at_first(20);
            ll.add_at_first(30);
            ll.print();
            ll.add_at_last(100);
            ll.add_at_last(110);
            ll.print();
            ll.add_at_any_pos(3,1500);
            ll.print();
        }
    
    }
    
    
}
