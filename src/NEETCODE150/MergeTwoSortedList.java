package NEETCODE150;
import java.util.*;
public class MergeTwoSortedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void Print() {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node MergeList(Node list1, Node list2) {
        Node newNode = new Node(-1);
        Node current = newNode;

        while(list1 != null && list2 != null) {
            if(list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return newNode.next;
    }
}
