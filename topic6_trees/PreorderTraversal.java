import java.io.*;
import java.util.*;

public class Solution {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static Node insert(Node root, int value) {
        if (root == null) {
            Node n = new Node();
            n.data = value;
            return n;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Input: n, then n values inserted into a BST; output preorder traversal
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.hasNextInt() ? in.nextInt() : 0;
        Node root = null;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            root = insert(root, v);
        }
        preOrder(root);
        System.out.println();
    }
}
