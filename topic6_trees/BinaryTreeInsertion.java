import java.io.*;
import java.util.*;

public class Solution {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node Insert(Node root, int value) {
        if (root == null) {
            Node newTree = new Node();
            newTree.data = value;
            return newTree;
        }
        insertNodeRecursive(root, value);
        return root;
    }

    static void insertNodeRecursive(Node root, int value) {
        if (value > root.data) {
            if (root.right == null) {
                Node newNode = new Node();
                newNode.data = value;
                root.right = newNode;
            } else {
                insertNodeRecursive(root.right, value);
            }
        } else if (value < root.data) {
            if (root.left == null) {
                Node newNode = new Node();
                newNode.data = value;
                root.left = newNode;
            } else {
                insertNodeRecursive(root.left, value);
            }
        }
    }

    private static void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    // Input: n, then n values to insert; output inorder traversal
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.hasNextInt() ? in.nextInt() : 0;
        Node root = null;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            root = Insert(root, v);
        }
        printInOrder(root);
        System.out.println();
    }
}
