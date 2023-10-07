class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null) return head;
        Node nextNode=head.next;
        head.next=pairwiseSwap(nextNode.next);
        nextNode.next=head;
        return nextNode;
    }
}