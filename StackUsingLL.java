public class StackUsingLL {
	
	StackNode top;

	class StackNode{
		
		int data;
		StackNode next;

		StackNode(int d) {
            
            data = d;
			next = null;
		}
	}

    public boolean isEmpty(){

        if(top == null){
            return true;
        }

        return false;
    }
	
	public void push(int data) {

        StackNode newNode = new StackNode(data);		
		newNode.next = top;
		top  = newNode;
		
        System.out.println(data + " pushed to stack");
	}
	
	public void pop() {

        if(top == null) {
            System.out.println("Stack Underflow");
            return;
        }
		
		top = top.next;
	}
	
	public int peek() {

        if(top == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

		return top.data;
	}
	
	public void print() {

        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }

		StackNode current = top;
		while (current != null) {
			System.out.print(current.data+" ");
			
			current = current.next;
		}
		
	}

    public static void main(String[] args){

        StackUsingLL s = new StackUsingLL();
        s.print();
        s.peek();
        s.pop();

        s.push(5);
        s.push(8);
        s.push(6);
        s.push(4);
        s.push(2);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        s.print();

        if(s.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is not Empty");
        }

    }
}