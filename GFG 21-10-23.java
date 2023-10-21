class Solution{
    static long sumOfDivisors(int N){
        // code here
        long result=0;
        for(int i=1;i<=N;i++){
            result+=(N/i)*i;
        }
        return result;
    }
}