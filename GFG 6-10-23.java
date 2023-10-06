class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        Node parent=null;
        Node temp=null;
        Node temp_start=null;
        int count=0;
        while(odd!=null){
            count++;
            if(count%2==0){
                parent.next=odd.next;
                if(temp==null){
                    temp=new Node(odd.data);
                }else{
                    Node newNode=new Node(odd.data);
                    newNode.next=temp;
                    temp=newNode;
                }
            }else{
                temp_start=odd;
            }
            parent=odd;
            odd=odd.next;
        }
        temp_start.next=temp;
    }
}
