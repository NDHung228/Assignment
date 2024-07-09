package Day9_7.Ex1;


public class Solution {

    public  ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode nextNode = head;

        while (nextNode != null && nextNode.next != null) {

            node = node.next;
            nextNode = nextNode.next.next;

            try {
                System.out.println("demo node: " +node.val);
                System.out.println("demo next node: " +nextNode.val);
            } catch (Exception e) {
                System.out.println("error "+e.getMessage());
            }

        }
        return node;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2,listNode1);
        ListNode listNode3 = new ListNode(3,listNode2);
        ListNode listNode4 = new ListNode(4,listNode3);
        ListNode listNode5 = new ListNode(5,listNode4);
        ListNode listNode6 = new ListNode(6,listNode5);
        ListNode listNode7 = new ListNode(7,listNode6);

        Solution solution = new Solution();
        System.out.println(solution.middleNode(listNode7).val);
        System.out.println(solution.middleNode(listNode6).val);
    }
}
