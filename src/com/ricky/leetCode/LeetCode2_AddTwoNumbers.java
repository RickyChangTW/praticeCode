package com.ricky.leetCode;

public class LeetCode2_AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        boolean isCarry = false;
        while (l1 != null || l2 != null) {
            int l1Value = 0;
            int l2Value = 0;
            if (l1 != null) {
                l1Value = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Value = l2.val;
                l2 = l2.next;
            }
            int sum = l1Value + l2Value + temp.val;
            if (sum >= 10) {
                isCarry = true;
                temp.val = sum % 10;
            } else {
                isCarry = false;
                temp.val = sum;
            }
            if (l1 != null || l2 != null || isCarry) {
                if (isCarry) {
                    temp.next = new ListNode(1);
                } else {
                    temp.next = new ListNode();
                }
                temp = temp.next;
            }
        }
        return result;

    }
}
