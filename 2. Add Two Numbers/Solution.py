# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        # A dummy node to simplify adding notes to the result
        dummy_head = ListNode(0)
        current = dummy_head
        carry = 0

        # Traverse both lists
        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            sum = val1 + val2 + carry
            carry = sum // 10 # Get the 2nd digit from the sum
            sum = sum % 10 # Get only the last digit from the sum
            current.next = ListNode(sum)
            current = current.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        return dummy_head.next