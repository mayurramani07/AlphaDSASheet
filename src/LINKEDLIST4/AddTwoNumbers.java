package LINKEDLIST4;
import java.util.*;
public class AddTwoNumbers {
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
    public Node AddTwoNumbers(Node list1, Node list2) {
        Node newNode = new Node(0);
        Node curr = newNode;
        int carry = 0;

        while(list1 != null || list2 != null || carry > 0) {
            int sum = carry;

            if(list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }
            if(list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return newNode.next;
    }
}
