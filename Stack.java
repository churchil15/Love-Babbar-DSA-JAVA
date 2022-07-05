public class Stack {
    
    final int MAX = 10;
    int top;
    int a[] = new int[MAX];

    Stack(){
        top = -1;   // underflow condition (when the stack is empty)
    }

    public boolean isEmpty(){

        if(top<0){
            return true;
        }

        return false;
    }

    public void push(int data){
        
        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return;
        }

        a[++top] = data;
        System.out.println(data + " pushed into the stack");
        return;
    }  

    public int pop (){

        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }

        int x = a[top--];
        return x;
    }

    public int peek() {
        
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }

        int x = a[top];
        return x;
    }

    public void print() {
        for(int i = top;i>-1;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){

        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        // stack.print();

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());


        // if(stack.isEmpty()){
        //     System.out.println("Stack is Empty");
        // }
        // else{
        //     System.out.println("Stack is not Empty");
        // }

        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);
        stack.push(50);

        stack.print();

        stack.push(55);

        
    }

    
}
