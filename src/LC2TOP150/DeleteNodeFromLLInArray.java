package LC2TOP150;
import java.util.*;
public class DeleteNodeFromLLInArray {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node DeleteNode(int[] nums, Node head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;

        while(curr.next != null) {
            if(set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
