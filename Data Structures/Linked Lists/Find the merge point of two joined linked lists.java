/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

int FindMergeNode(Node headA, Node headB) {
    Node A = headA;
    Node B = headB;

    while(A != B){

        if(A.next == null){
            A = headB;
        }else{
            A = A.next;
        }
        if(B.next == null){
            B = headA;
        }else{
            B = B.next;
        }
    }
    return B.data; 
}