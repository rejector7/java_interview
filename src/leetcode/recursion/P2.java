package leetcode.recursion;

public class P2 {
//    class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            return addTwoNumbersWithCarry(l1, l2, 0);
//        }
//        private ListNode addTwoNumbersWithCarry(ListNode l1, ListNode l2, int carry){
//            ListNode cur = new ListNode(0);
//            if(l1 == null){
//                if(carry == 0){
//                    return l2;
//                }else{
//                    return addTwoNumbersWithCarry(new ListNode(1), l2, 0);
//                }
//            }
//            if(l2 == null){
//                return carry == 0 ? l1: addTwoNumbersWithCarry(new ListNode(1), l1, 0);
//            }
//            int temp = l1.val + l2.val + carry;
//            cur.val = temp >= 10 ? temp - 10: temp;
//            int nextCarry = temp >= 10 ? 1: 0;
//            cur.next = addTwoNumbersWithCarry(l1.next, l2.next, nextCarry);
//            return cur;
//        }
//    }
//    class Solution{
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        }
//    }
}


