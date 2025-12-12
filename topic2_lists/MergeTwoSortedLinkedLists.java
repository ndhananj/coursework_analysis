import java.io.*;
import java.util.*;

public class Solution {

    static class Node {
        int data;
        Node next;
    }

    static Node mergeLists(Node headA, Node headB) {
        Node newHead = null;
        Node newTail = null;
        while (headA != null || headB != null) {
            int value;
            if (headA == null || headB != null && headA.data > headB.data) {
                value = headB.data;
                headB = headB.next;
            } else {
                value = headA.data;
                headA = headA.next;
            }
            Node n = new Node();
            n.data = value;
            if (newHead == null) {
                newHead = n;
                newTail = n;
            } else {
                newTail.next = n;
                newTail = n;
            }
        }
        return newHead;
    }

    private static Node buildList(Scanner in, int n) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.data = in.nextInt();
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
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

    // Input: n1, n1 values, n2, n2 values
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.hasNextInt() ? in.nextInt() : 0;
        Node headA = buildList(in, n1);
        int n2 = in.hasNextInt() ? in.nextInt() : 0;
        Node headB = buildList(in, n2);
        Node merged = mergeLists(headA, headB);
        printList(merged);
    }
}
