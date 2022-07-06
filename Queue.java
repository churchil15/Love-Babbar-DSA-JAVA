public class Queue {
    
    int front, rear, size;
    int queue[];
 
    Queue(int s)
    {
        front = rear = 0;
        size = s;
        queue = new int[size];
    }
 
    void enqueue(int data)
    {
        if (size == rear) {
            System.out.println("Queue is full");
            return;
        }
 
        
        queue[rear] = data;  
        rear++;      
        return;
    }

    void dequeue()
    {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
 
        rear--;
        return;
    }
 
    void print()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
 
        for (i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
        return;
    }
 
    void peek()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front]);
        return;
    }

    public static void main(String args[]) {
        
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

        q.enqueue(55);
        q.print();
        q.enqueue(35);
    }
 }
 