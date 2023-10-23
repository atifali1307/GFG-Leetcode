class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp=new int[n];
	    int ans=Integer.MIN_VALUE;
	    for(int idx=0;idx<n;idx++)
	        dp[idx]=arr[idx];
	    for(int idx1=0;idx1<n;idx1++){
	        for(int idx2=0;idx2<idx1;idx2++){
	            if(arr[idx1]>arr[idx2])
	                dp[idx1]=Math.max(dp[idx2]+arr[idx1],dp[idx1]);
	        }
	        ans=Math.max(ans,dp[idx1]);
	    }
	    return ans;
	}  
}