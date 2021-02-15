

public class PreorderTraversal {
    private static Node root;
    
    private static class Node{
        int value;
        Node left;
        Node right;
        
        public Node(int value){
            this.value = value;
        }
    }
    
    public static void preorderTraverse(Node value){
        if(value==null) return;
        System.out.print(value.value+" ");
        preorderTraverse(value.left);
        preorderTraverse(value.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(6);
        
        root = a;
        a.right = b;
        b.right = c;
        c.left = d;
        d.left = e;
        c.right = f;
        
        preorderTraverse(a);
        
        
    }
}
