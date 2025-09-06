package LINKEDLIST5;
import java.util.*;
public class RotateList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void print() {
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
    public static Node RotateList(Node head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 0;
        Node tail = head;
        while(tail != null) {
            tail = tail.next;
            size++;
        }
        tail.next = head;

        k = k % size;
        int stepsToNewHead = size - k;

        Node newTail = head;
        for(int i=1 ; i<stepsToNewHead ; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;


    }
}
