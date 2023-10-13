class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int result=-1;
        while(root!=null){
            if(root.data<=x){
                result=root.data;
                root=root.right;
            }
            else if(root.data>x){
                root=root.left;
            }
        }
        return result;
    }
}