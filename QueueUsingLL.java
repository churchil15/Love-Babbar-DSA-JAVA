public class QueueUsingLL {
    
    static class Node{

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Queue {

        Node head = null;
        Node tail = null;

        public boolean isEmpty(){

            if(head == null && tail == null){
                return true;
            }

            return false;
        }

        // Enqueue
        public void enqueue(int data){

            Node newNode = new Node(data);

            if(tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        // Dequeue
        public void dequeue(){

            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            if(head == tail){
                tail = null;
            }

            // int front = head.data;
            head = head.next;
            // return front;
        }

        public void peek(){

            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println(head.data);
        }

        public void print(){

            if(head == null){
                System.out.println("Queue is Empty");
                return;
            }
            
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }

            System.out.println();
        }
    }



    public static void main(String[] args){

        Queue q = new Queue();

        q.peek();
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

        q.enqueue(55);
        q.print();
        q.enqueue(35);
    }
}

