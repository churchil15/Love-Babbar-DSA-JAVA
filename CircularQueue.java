public class CircularQueue {
    
        static class Queue{
            
            int arr[];
            int size;
            int rear = -1;
            int front = -1;

            Queue(int n){
                arr = new int[n];
                size = n;
            }

            public boolean isEmpty() {

                if(rear == -1 && front == -1){
                    return true;
                }

                return false;
            }

            public boolean isFull(){

                if((rear + 1) % size == front){
                    return true;
                }

                return false;
            }

            // Enqueue
            public void enqueue(int data){

                if(isFull()){
                    System.out.println("Queue is Full");
                    return;
                }

                // When Queue is Empty
                if(front == -1){
                    front = 0;
                }

                rear = (rear + 1) % size;
                arr[rear] = data;
            }

            // Dequeue
            public void dequeue(){

                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return;
                }

                // single element condition
                if(rear == front){
                    rear = front = -1;
                }
                else {
                    // front last pr aachuka hai, usko first position pr le jaana hai
                    front = (front + 1) % size;
                }

            } 

            public void peek(){

                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return;
                }

                System.out.println(arr[front]);
            }

            public void print(){

                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return;
                }

                if(rear >= front){
                    
                    for(int i = front; i <= rear; i++){
                        System.out.print(arr[i] + " ");
                    }
                    
                    System.out.println();
                }
                else{

                    for(int i = front; i < size; i++){
                        System.out.print(arr[i] + " ");
                    }

                    for(int i = 0; i <= rear; i++){
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                }
            }
        }


        public static void main(String[] args){
            Queue q = new Queue(5);

            q.print();
            q.dequeue();

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);

            q.print();

            q.dequeue();
            q.peek();
        
            q.print();

            q.enqueue(6);
            q.print();
            q.enqueue(35);
        }
}
