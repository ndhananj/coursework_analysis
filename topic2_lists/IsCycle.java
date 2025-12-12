import java.io.*;
import java.util.*;

public class Solution {
    static class Node {
        int data;
        Node next;
    }

    static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Set<Node> nodeTrackingList = new HashSet<Node>();
        while (head != null) {
            if (nodeTrackingList.contains(head)) {
                return true;
            }
            nodeTrackingList.add(head);
            head = head.next;
        }
        return false;
    }

    static Node buildListWithCycle(Scanner in, int n, int cyclePos) {
        Node head = null;
        Node tail = null;
        Node cycleNode = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.data = in.nextInt();
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            if (i == cyclePos) {
                cycleNode = node;
            }
        }
        if (cyclePos >= 0 && cycleNode != null && tail != null) {
            tail.next = cycleNode;
        }
        return head;
    }

    // Input: n, n values, cyclePos (-1 for none)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.hasNextInt() ? in.nextInt() : 0;
        int cyclePos = in.hasNextInt() ? in.nextInt() : -1;
        Node head = buildListWithCycle(in, n, cyclePos);
        System.out.println(hasCycle(head) ? "true" : "false");
    }
}
