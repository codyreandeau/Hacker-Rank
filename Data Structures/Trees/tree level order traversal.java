   /* 
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root) {
        
       Queue<Node> q = new LinkedList();
       q.add(root);
    
    while(!q.isEmpty()){
     
        Node current = q.remove();
        System.out.print(current.data + " ");
        
        if (current.left!=null) {
            q.add(current.left);
        } 
        if (current.right!=null) {
            q.add(current.right);
        }
    }
}