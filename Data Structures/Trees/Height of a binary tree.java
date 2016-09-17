   /*
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root){
       if(root == null){
           return -1;
       }
    int left = height(root.left);
    int right = height(root.right);

    if (right < left) {
        return left + 1;
    } else {
        return right + 1;
    }
 }