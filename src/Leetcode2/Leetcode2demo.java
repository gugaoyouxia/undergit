package Leetcode2;

public class Leetcode2demo {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        ListNode tempL = ret;
        int temp = 0;
        while (l1 != null && l2 != null) {
            tempL.val = (l1.val + l2.val + temp) % 10 ;
            temp = (l1.val + l2.val + temp) / 10;
            l1 = l1.next;
            l2 = l2.next;
            tempL.next = new ListNode();
            tempL = tempL.next;
        }
        ListNode l;
        if(l1 == null){
            l = l2;
        }
        else l = l1;
        while(l != null){
            tempL.val = (l.val + temp) % 10 ;
            temp = (l.val + temp) / 10;
            l = l.next;
            tempL.next = new ListNode();
            tempL = tempL.next;
        }

        return ret;
    }

    public static void main(String[] args) {

    }

}
