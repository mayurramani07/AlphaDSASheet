package LINKEDLIST1;
import java.util.*;
public class RemoveNthNodeFromEndLL {
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
    public static Node RemoveNthNode(Node head, int n) {
        int size = 0;
        Node temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }
        if(n == size) {
            return head.next;
        }
        int iToFind = size - n;
        Node prev = head;
        int i = 1;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return head;
    }
}
