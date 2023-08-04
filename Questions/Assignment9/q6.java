package Important_Questions_in_java.Assignment9;
/* find height and depth of a binary tree */
public class q6 {
    static int height = -1;
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int item) {
        Node temp = new Node();
        temp.data = item;
        temp.left = temp.right = null;
        return temp;
    }

     protected static int findDepth(Node root, int x) {
        if (root == null)
            return -1;

        int dist = -1;      // initialize distance

        if ((root.data == x)  ||  (dist=findDepth(root.left, x)) >= 0  ||  (dist=findDepth(root.right, x)) >= 0)
            return dist+1;

        return dist;
    }

    protected static int findHeightUtil(Node root, int x) {
        if (root == null)
            return -1;

        int leftHeight = findHeightUtil(root.left, x);
        int rightHeight = findHeightUtil(root.right, x);

        int ans = Math.max(leftHeight, rightHeight) + 1;

        if (root.data == x)
            height = ans;

        return ans;
    }

    protected static int findHeight(Node root, int x) {
        findHeightUtil(root, x);
        return height;
    }


    // main method or drive code
    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(12);
        root.right = newNode(13);
        root.left.left = newNode(15);
        root.left.right = newNode(17);
        root.left.right.right = newNode(19);
        root.right.left = newNode(22);
        root.right.right = newNode(26);

        int k = 15;     // selected node
        System.out.println("Depth: "+findDepth(root, k));
        System.out.println("Height: "+findHeight(root, k));
    }
}