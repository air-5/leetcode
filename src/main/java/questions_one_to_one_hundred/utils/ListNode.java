package questions_one_to_one_hundred.utils;

public class ListNode {
    public ListNode next;
    public int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode temp = this;
        StringBuilder sb = new StringBuilder();
        while(temp != null) {
            sb.append(" val ").append(temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }
}
