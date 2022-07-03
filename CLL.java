public class CLL {
    
    Node head;
    Node tail;

    class Node {
        
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }

    // Add - First
    public void addFirst(int data){

        Node newNode = new Node(data);

        // If the List is empty
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    // Add - Last
    public void addLast(int data){
        
        Node newNode = new Node(data);

        // If the List is empty
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    // Add - Middle
    public void addInMiddle(int pos, int data){

        if(pos > getSize() || pos < 0){
            System.out.println("Invalid Position Value");
            return;
        }

        Node newNode = new Node(data);
        
        if(head == null || pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        int cnt = 1;

        while(cnt < pos){
            currNode = currNode.next;
            cnt++;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    // Delete - First
    public void deleteFirst(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        temp = temp.next;
        head = temp;
        tail.next = head;
    }

    // Delete - Last
    public void deleteLast() {

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == head){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  // head.next = null  -> lastNode = null
        while(lastNode.next != head){  // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = head;
        tail = secondLast;

    }

    // Delete - Middle
    public void deleteInMiddle(int pos){

        Node currNode = head;
        Node prevNode = null;

        int cnt = 1;
        while(cnt <= pos){
            prevNode = currNode;
            currNode = currNode.next;
            cnt++;
        }

        prevNode.next = currNode.next;
        currNode.next = null;

    }

    public void print(){
         
        Node newNode = head;

        if(head != null){
            do{
                System.out.print(newNode.data + " -> ");
                newNode = newNode.next;
            } while (newNode != head);
        }
        System.out.println("HEAD");
    }

    public int getSize() {
        
        Node temp = head;
        int count = 1;
        while(temp != tail){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){

        CLL list = new CLL();

        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(20);
        list.print();

        list.deleteFirst();
        list.print();

        list.addFirst(0);
        list.print();

        list.addInMiddle(2, 7);
        list.print();

        list.deleteLast();
        list.print();

        list.deleteInMiddle(2);
        list.print();

        System.out.println(list.getSize());
    }

}
