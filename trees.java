class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Wrapper methods to start traversal from the root
    void inorderTraversal() {
        inorder(root);
    }

    void preorderTraversal() {
        preorder(root);
    }

    void postorderTraversal() {
        postorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal();
        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal();
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal();
    }
}