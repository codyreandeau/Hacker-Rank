/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newNode = new Node();
    newNode.data = data;
    
    if(head==null){
        head.data = data;
        return head;
    }
    
    if(position == 0) {
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    Node tmp = head;
    Node prev = null;
    for(int i=0; i < position; i++){
        prev = tmp;
        tmp = tmp.next;
    }
    
        newNode.next = tmp;
        prev.next = newNode;
        return head;
}