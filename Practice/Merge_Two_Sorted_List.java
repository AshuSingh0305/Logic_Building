// Leetcode: 21 - Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
package Practice;

public class Merge_Two_Sorted_List {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1=list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr=curr.next;
        }
        if(list1 != null){
            curr.next = list1;
        }
        if(list2 != null){
            curr.next = list2;
        }
        return dummy.next;
    }
}
