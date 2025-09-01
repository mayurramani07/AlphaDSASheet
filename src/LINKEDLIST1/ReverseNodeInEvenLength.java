package LINKEDLIST1;
import java.util.*;
public class ReverseNodeInEvenLength {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void print(Node head) {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseEvenGroups(Node head) {
        Node newNode = new Node(0);
        newNode.next = head;
        Node prevGroupTail = newNode;
        Node curr = head;

        int groupSize = 1;

        while (curr != null) {
            Node groupHead = curr;
            int count = 0;
            Node temp = curr;

            while (temp != null && count < groupSize) {
                temp = temp.next;
                count++;
            }

            if (count % 2 == 0) {
                Node prev = null;
                Node node = groupHead;
                Node next;

                for (int i = 0; i < count; i++) {
                    next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }
                prevGroupTail.next = prev;
                groupHead.next = temp;
                prevGroupTail = groupHead;
                curr = temp;
            } else {
                for (int i = 0; i < count; i++) {
                    prevGroupTail = curr;
                    curr = curr.next;
                }
            }

            groupSize++;
        }

        return newNode.next;
    }
}