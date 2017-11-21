//138. Copy List with Random Pointer (Java)
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        
        RandomListNode rln = head, next;       
        while (rln != null) {
            next = rln.next;
            RandomListNode copy = new RandomListNode(rln.label);
            rln.next = copy;
            copy.next = next;
            rln = next;
        }
        
        rln = head;
        while (rln != null) {
            if (rln.random != null) {
                rln.next.random = rln.random.next;
            }
            rln = rln.next.next;
        }
        
        rln = head;
        RandomListNode result = new RandomListNode(0);
        RandomListNode copy;
        RandomListNode copyrln = result;
        while (rln != null) {
            next = rln.next.next;
            copy = rln.next;
            copyrln.next = copy;
            copyrln = copy;
            rln.next = next;
            rln = next;
        }
        
        return result.next;
    }
}