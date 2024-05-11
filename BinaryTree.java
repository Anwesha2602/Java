class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}


class Tree{
    Node root;
    Node insertRecursive(Node root,int data){ 
        if (root==null)
            root = new Node(data);
        else if(root.data>data){
            root.left = insertRecursive(root.left, data);
        }
        else if(root.data<data){
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }
    void insert(int data){
        root = insertRecursive(root, data);    
    }
    void show(){
        inorder(root);
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data );
            inorder(root.right);
        }
    }

}

public class BinaryTree {
   public static void main(String[] args) {
    Tree ob = new Tree();
    ob.insert(8);
    ob.insert(7);
    ob.insert(12);
    ob.insert(5);
    ob.show();
   } 
}
