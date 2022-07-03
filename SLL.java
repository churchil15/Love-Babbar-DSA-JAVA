public class SLL {

    Node head; 

    class Node{

        String data;
        Node next;   // next ek agle node ko point krrha hai to uska type Node hoga
    
        Node(String d){
            data = d;
            next = null; //shuruwat me single node create hoga koi list nhi create nhi hogi. isiliye shuruwat me node ke next ko null krdenge
        } 
    }

    // Adding - First
    public void addFirst(String data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // Adding - Last
    public void addLast(String data){

        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        // traverse
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Adding - Middle
    public void addInMiddle(int pos, String data){

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

    // Print
    public void printList(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }
    
    // Delete - First
    public void deleteFirst(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Delete - Last
    public void deleteLast(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  // head.next = null  -> lastNode = null
        while(lastNode.next != null){  // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
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

    public int getSize() {
        
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    

    public static void main(String[] args){

        SLL list = new SLL();

        list.addInMiddle(0, "This");
        list.addInMiddle(1, "is");
        list.addInMiddle(2, "a");
        list.addInMiddle(3, "Linked");
        list.addInMiddle(4, "List");

        list.addInMiddle(2, "definitely");

        list.printList();

        list.deleteInMiddle(2);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());
        
    }
}
