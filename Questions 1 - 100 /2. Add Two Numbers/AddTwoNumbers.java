
import leetcode.util.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNodeExample1First = new ListNode(2);
        listNodeExample1First.next = new ListNode(4);
        listNodeExample1First.next.next = new ListNode(3);

        ListNode listNodeExample1Second = new ListNode(5);
        listNodeExample1Second.next = new ListNode(6);
        listNodeExample1Second.next.next = new ListNode(4);

        ListNode resExample1 = new AddTwoNumbers().addTwoNumbers(listNodeExample1First, listNodeExample1Second);
        System.out.println(resExample1);

        ListNode listNodeExample2First = new ListNode(9);
        listNodeExample2First.next = new ListNode(9);
        listNodeExample2First.next.next = new ListNode(9);

        ListNode listNodeExample2Second = new ListNode(9);
        listNodeExample2Second.next = new ListNode(9);
        listNodeExample2Second.next.next = new ListNode(8);

        ListNode resExample2 = new AddTwoNumbers().addTwoNumbers(listNodeExample2First, listNodeExample2Second);
        System.out.println(resExample2);

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return l1;
        }

        int carry = 0;
        ListNode resList = new ListNode(0);
        ListNode curr = resList;

        while(l1 != null || l2 != null) {
            int first = l1 != null ? l1.val : 0;
            int sec = l2 != null ? l2.val : 0;
            int sum = first + sec + carry;
            int data = 0;
            if(sum > 9) {
                carry = 1;
                data = sum % 10;
            } else {
                carry = 0;
                data = sum;
            }
            curr.next = new ListNode(data);
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carry == 1) {
            curr.next = new ListNode(carry);
        }
        return resList.next;
    }
}
