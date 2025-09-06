package LINKEDLIST5;
import java.util.*;
public class AddTwoNumbers2 {
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
    public Node AddTwoNumbers(Node list1 , Node list2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(list1 != null) {
            s1.push(list1.data);
            list1 = list1.next;
        }
        while(list2 != null) {
            s2.push(list2.data);
            list2 = list2.next;
        }
        int carry = 0;
        Node head = null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry > 0) {
            int x = s1.isEmpty() ? 0 : s1.pop();
            int y = s2.isEmpty() ? 0 : s1.pop();


            int sum = x + y + carry;
            carry = sum / 10;

            Node node = new Node(sum % 10);
            node.next = head;
            head = node;

        }
        return head;
    }
}
