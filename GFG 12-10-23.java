class Solution {
    int dupSub(Node root) {
        // code here 
        if(root==null||(root.left==null&&root.right==null)) return 0;
        Map<String, Integer> map=new HashMap<>();
        preorderTraversal(root.left, map);
        preorderTraversal(root.right, map);
        for(Map.Entry<String,Integer> me:map.entrySet())
           if(me.getValue()>1) return 1;
        
        return 0;
    }
    
    String preorderTraversal(Node root, Map<String, Integer> map){
        if(root==null) return "#";
        if(root.left==null&&root.right==null) return root.data+"";
        String s=root.data+"";
        s+=preorderTraversal(root.left,map);
        s+=preorderTraversal(root.right,map);
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
}