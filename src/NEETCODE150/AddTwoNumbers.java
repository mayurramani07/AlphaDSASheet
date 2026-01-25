package NEETCODE150;
import java.util.*;
public class AddTwoNumbers {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void Print(Node head) {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            temp= temp.next;
            System.out.println(temp.data + "->");
        }
        System.out.println("Null");
    }
    public static Node AddTwoNumbers(Node l1, Node l2) {
        Node newNode = new Node(0);
        Node curr = newNode;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return newNode.next;
    }
}
