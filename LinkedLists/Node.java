package LinkedLists;

public class Node {

    int value;
    Node next;
    
    Node(int value){
        this.value = value;
        next = null;
    }

    public String toString() {
        return "" + this.value;
    }
    
}