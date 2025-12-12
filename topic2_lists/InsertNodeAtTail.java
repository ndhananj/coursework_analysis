import java.io.*;
import java.util.*;

public class Solution {

    static class Node {
        int data;
        Node next;
    }

    static Node Insert(Node head, int data) {
        Node tail = new Node();
        tail.data = data;
        if (head == null) {
            return tail;
        }
        Node trackingNode = head;
        while (trackingNode.next != null) {
            trackingNode = trackingNode.next;
        }
        trackingNode.next = tail;
        return head;
    }

    private static Node buildList(Scanner in, int n) {
        Node head = null;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            head = Insert(head, v);
        }
        return head;
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
            if (curr != null) System.out.print(" ");
        }
        System.out.println();
    }

    // Input: n (list length), n values, dataToInsert (append)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.hasNextInt() ? in.nextInt() : 0;
        Node head = buildList(in, n);
        if (in.hasNextInt()) {
            int dataToInsert = in.nextInt();
            head = Insert(head, dataToInsert);
        }
        printList(head);
    }
}
