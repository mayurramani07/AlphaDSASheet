package LINKEDLIST2;
import java.util.*;
public class SwappingNodesInLinkedList {
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
    public static Node swapNode(Node head, int k) {
        if(head == null) {
            return null;
        }
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        Node first = head;
        for(int i=1 ; i<k ; i++) {
            first = first.next;
        }

        Node second = head;
        for(int i=1 ; i<size - k ; i++) {
            second = second.next;
        }

        int t = first.data;
        first.data = second.data;
        second.data = t;


        return head;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)