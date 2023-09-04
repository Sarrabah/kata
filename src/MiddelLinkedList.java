/* Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one. */
public class MiddelLinkedList {
    public ListNode middleNode(ListNode head) {
        //ListNode head =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode listPrime =head;
        int size =0;
        while(head != null){
            size++;
            head = head.next;
        }
        //System.out.println("the size of head is : "+ size);
        ListNode middleNode = null;
        int middle = (size / 2) + 1;
        int i=0;
        while(listPrime != null){
            i++;
            if(i == middle){
                middleNode = listPrime;
                break;
            }
            listPrime= listPrime.next;
        }
        return middleNode;
    }
}
