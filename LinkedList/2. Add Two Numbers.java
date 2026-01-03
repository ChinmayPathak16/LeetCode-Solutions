class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify result list handling
        ListNode dummy = new ListNode(0);
        // Pointer to build the result list
        ListNode ptr = dummy;
        // Carry from previous digit addition
        int carry = 0;

        // Continue while any list has nodes left or carry exists
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry; // start with carry

            // Add value from first list if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from second list if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Update carry for next iteration
            carry = sum / 10;

            // Create new node with current digit
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
        }

        // Return head of the resulting linked list
        return dummy.next;
    }
}
