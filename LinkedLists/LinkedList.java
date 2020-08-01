package LinkedLists;

/**
 * LinkedLists
 */

public class LinkedList {

    Node head;

    void append(int add){
        if (this.head == null){
            this.head = new Node(add);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        
        last.next = new Node(add);

    }

    public String toString(){
        if (this.head == null){
            return "the list is empty";
        }
        Node temp = head;
        String sum = "";
        int size = length(temp);
        for(int i = 0; i < size; i++){
            sum += temp.toString() + " ";
            temp = temp.next;
        }
        return sum;
    }

    static int length(Node head){
        Node temp = head; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 
    }

}