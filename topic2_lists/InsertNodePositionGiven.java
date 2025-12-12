import java.io.*;
import java.util.*;

public class Solution {

    static class Node {
        int data;
        Node next;
    }

    static Node InsertNth(Node head, int data, int position) {
        Node toInsert = new Node();
        toInsert.data = data;
        if (head == null) {
            return toInsert;
        }
        if (position == 0) {
            toInsert.next = head;
            return toInsert;
        }
        int index = 0;
        Node tracker = head;
        while (tracker.next != null && index != position - 1) {
            tracker = tracker.next;
            index++;
        }
        insertInBetween(tracker, toInsert);
        return head;
    }

    private static void insertInBetween(Node current, Node toInsert) {
        Node tmp = current.next;
        current.next = toInsert;
        toInsert.next = tmp;
    }

    private static Node buildList(Scanner in, int n) {
        Node head = null;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            head = InsertNth(head, v, i); // append at end
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

    // Input: n, n list values, data, position
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.hasNextInt() ? in.nextInt() : 0;
        Node head = buildList(in, n);
        if (in.hasNextInt()) {
            int data = in.nextInt();
            int pos = in.hasNextInt() ? in.nextInt() : 0;
            head = InsertNth(head, data, pos);
        }
        printList(head);
    }
}
