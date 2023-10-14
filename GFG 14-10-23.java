class Solution
{
    static boolean find(int target,Node node){
        if(node==null) return false;
        if(node.data==target) return true;
        boolean fl1=false;
        boolean fl2=false;
        if(target>node.data)
            fl1=find(target,node.right);
        else
            fl2=find(target,node.left);
        return fl1 || fl2;
    }
    static void helper(Node node,Node root,ArrayList<Integer> ans){
        if(node==null) return;
        helper(node.left,root,ans);
        if(find(node.data,root)==true)ans.add(node.data);
        helper(node.right,root,ans);
    }
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> result=new ArrayList<>();
        helper(root1,root2,result);
        return result;
    }
}
