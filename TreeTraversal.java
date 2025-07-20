class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class TreeTraversal {

    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();

        Node root = new Node(90);
        root.left = new Node(110);
        root.right = new Node(200);
        root.left.left = new Node(210);
        root.left.right = new Node(90);
        root.right.right = new Node(60);
        root.right.left = new Node(70);
        

        System.out.println("Preorder:");
        tree.preorder(root);

        System.out.println("\nInorder:");
        tree.inorder(root);

        System.out.println("\nPostorder:");
        tree.postorder(root);
    }
}