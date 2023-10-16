class Solution{
    static HashMap<Integer, Integer> map=new HashMap<>();
    static int dfs(int i,int j,int[][] grid,boolean[][] visited,int name,int n){
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j]==0 || visited[i][j]) return 0;
        visited[i][j]=true;
        grid[i][j]=name;
        int count=1+dfs(i+1,j,grid,visited,name,n)+dfs(i,j+1,grid,visited,name,n)+dfs(i-1,j,grid,visited,name,n)+dfs(i,j-1,grid,visited,name,n);
        return count;
    }
    public int largestIsland(int n,int[][] grid) 
    {
        // code here
        int name=2;
        boolean[][] visited=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int count=dfs(i,j,grid,visited,name,n);
                    map.put(name,count);
                    name++;
                }
            }
        }
        int answer=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    int down = (i + 1 < n) ? grid[i + 1][j] : 0;
                    int up = (i - 1 >= 0) ? grid[i - 1][j] : 0;
                    int left = (j + 1 < n) ? grid[i][j + 1] : 0;
                    int right = (j - 1 >= 0) ? grid[i][j - 1] : 0;
                    //set is used to store different islands connected to current cell
                    Set<Integer> set = new HashSet<>();
                    //storing names of adjacent islands
                    set.add(down);
                    set.add(up);
                    set.add(right);
                    set.add(left);
                    //result is initialized from 1 as the island count increases by 1 if a 0 is changed to 1
                    int result = 1;
                    for(int val : set) {
                        result += map.getOrDefault(val, 0);
                    }
                    answer = Math.max(answer, result);
                }
            }
        }
        //when all the cells were already 1
        if(answer == 0) return n * n;
        return answer;
    }
}
