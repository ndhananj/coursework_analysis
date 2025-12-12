import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static final int ADD_ELEMENT = 1;
    private static final int DEQUEUE_ELEMENT = 2;
    private static final int PRINT_ELEMENT = 3;

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int command = in.nextInt();
            switch(command) {
                case ADD_ELEMENT:
                    int element = in.nextInt();
                    queue.addToQueue(element);
                    break;
                case DEQUEUE_ELEMENT:
                    queue.dequeue();
                    break;
                case PRINT_ELEMENT:
                    queue.printElementAtFront();
                    break;
            }
        }
    }

    // Queue implemented with two stacks.
    static class MyQueue {
        private Stack mStackOne;
        private Stack mStackTwo;

        public MyQueue() {
            mStackOne = new Stack<Integer>();
            mStackTwo = new Stack<Integer>();
        }

        public void addToQueue(int element) {
          mStackOne.push(element);
        }

        public void dequeue() {
          if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
          }
          mStackTwo.pop();
        }

        public void printElementAtFront() {
          if (mStackTwo.isEmpty()) {
            changeQueues(mStackOne, mStackTwo);
          }
          System.out.println(mStackTwo.peek());
        }

        private void changeQueues(Stack origin, Stack destin) {
            while (!origin.empty()) {
              destin.push(origin.pop());
            }
        }
    }
}
