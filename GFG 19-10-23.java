class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[V];
        queue.offer(0);
        visited[0]=true;
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int node=queue.poll();
                for(int adjacent: adj.get(node)){
                    if(node==X){
                        return level;
                    }
                    if(!visited[adjacent]){
                        queue.offer(adjacent);
                        visited[adjacent]=true;
                    }
                }
            }
            level++;
        }
        return -1;
    }
    
}