package stack;

// import javax.swing.text.html.StyleSheet;

class mystack{
	private int arr[];
	private int idx;
	mystack(){
		arr=new int[5];
		idx=-1;
	}
	public void push(int element) {
		if(idx==arr.length-1) {
			System.out.println("Stack is full");
			return;
		}
		idx++;
		arr[idx]=element;
	}
	public int pop() {
		if(idx==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		int x=arr[idx];
		idx--;
		return x;
		
	}
	public int peek() {
		if(idx==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[idx];
	}
	public boolean isempty() {
		return idx==-1;
	}
	public int size() {
		return idx+1;
	}
	public void print() {
		for(int i=0;i<=idx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
public class implementatin_stack {

	public static void main(String[] args) {
		mystack st=new mystack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.print();
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.isempty());
		System.out.println(st.size());
		st.print();

	}

}