/*
   class Node 
       int data;
       Node left;
       Node right;
*/

int counter=0;

void top_view(Node root){
    
  if(root.left!=null && counter>=0){
    counter++;
    top_view(root.left);
  }

    System.out.print(root.data + " ");
    counter--;
    
if(root.right!=null && counter<0){
    counter--;
    top_view(root.right);

    }
}