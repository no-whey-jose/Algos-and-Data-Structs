package DataStructures.Trees;

public class BinarySearchTree {
     class Node {
         int value;
         Node left;
         Node right;

         Node(int value) {
             this.value = value;
         }
     }

     // Since we are setting root to null no constructor is needed
     Node root;

     public boolean insert(int value){
         Node newNode = new Node(value);
         if(root == null){
             root = newNode;
             return true;
         }
         Node temp = root;
         while (true){
             if (newNode.value == temp.value) return false;
             if (newNode.value < temp.value) {
                 if (temp.left == null){
                     temp.left = newNode;
                     return true;
                 }
                 temp = temp.left;
             } else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
             }
         }
     }

     public boolean contains(int value){
        if (root == null) return false;
         Node temp = root;
         while (temp != null){
             if (value == temp.value) return true;
             if (value < temp.value) {
                 temp = temp.left;
             } else {
                 temp = temp.right;
             }
         }
         return false;
     }

    void printTree(Node node)
    {
        if(node == null) return;

        System.out.println( node.value);
        printTree(node.left);
        printTree(node.right);
    }
}
