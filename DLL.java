public class DLL {

    Node head;

    class Node {
        
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    // Add - First
    public void addFirst(int data){
        
        Node newNode = new Node(data);

        newNode.next = head;       // head ke andar value first node ke address  ki hai
        newNode.prev = null;

        if(head != null){
            head.prev = newNode;
        }

        head = newNode;
    }

    // Add - Last
    public void addLast(int data){

        Node newNode = new Node(data);

        Node last = head;

        newNode.next = null;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    // Add - Middle
    public void addInMiddle(int pos, int data){

        if(pos > getSize() || pos < 0){
            System.out.println("Invalid Position Value");
            return;
        }

        Node newNode = new Node(data);

        Node tempNode = head;
        Node ptrNode = tempNode.next;
        int cnt = 1;

        while(cnt < pos){
            tempNode = tempNode.next;
            ptrNode = ptrNode.next;
            cnt++;
        }
        
        newNode.prev = tempNode;
        newNode.next = ptrNode;
        tempNode.next = newNode;
        ptrNode.prev = newNode;
    }

    public void printList(){

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

        Node temp = head;
        temp = temp.next;
        head = temp;
        temp.prev = null;
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

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete - Middle
    public void deleteInMiddle(int pos){
       
        Node temp = head;
        Node ptr = temp.next;
        
        int cnt = 1;
        while(cnt < pos){
            temp = ptr;
            ptr = ptr.next;
            cnt++;
        }

        temp.next = ptr.next;
        ptr.next.prev = temp;

        ptr.prev = null;
        ptr.next = null;
        
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

        DLL list = new DLL();

        list.addFirst(5);
        list.addFirst(10);
        list.printList();

        list.addLast(15);
        list.addLast(20);
        list.printList();

        list.addInMiddle(2, 7);
        list.printList();
        System.out.println(list.getSize());  // 5

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());   // 2

        list.addLast(9);
        list.addLast(11);
        list.addLast(13);
        list.printList();
        System.out.println(list.getSize());  // 5

        list.deleteInMiddle(2);
        list.printList();

        list.deleteInMiddle(2);
        list.printList();

        System.out.println(list.getSize());  // 3
    }
    
}
