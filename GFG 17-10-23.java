class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int grid[][])
    {
        // code here
          ArrayList<ArrayList<Integer>>a = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
                    for(int j=0;j<grid.length;j++)
                    {
                                for(int k=0;k<grid.length;k++)
                                {
                                    if(k==j)
                                    grid[j][k]=1;
                                    if(grid[j][k]==0)
                                    {
                                        if(grid[j][i]==1 && grid[i][k]==1)
                                        grid[j][k]=1;
                                    }
                                }
                    }
        }
        for(int i=0;i<N;i++)
        {
            ArrayList<Integer>arr = new ArrayList<>();
            for(int j=0;j<N;j++)
            {
                arr.add(grid[i][j]);
            }
            a.add(arr);
        }
        return a;
    }
}