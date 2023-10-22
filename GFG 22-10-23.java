class Solution{
    private static final int MOD=1000000007;
    private static long modInverse(long base){
        return power(base,MOD-2);
    }
    private static long power(long base,int exponent){
        long result=1;
        while(exponent>0){
            if(exponent%2==1){
                result=(result*base)%MOD;
            }
            base=(base*base)%MOD;
            exponent/=2;
        }
        return result;
    }
    private static int nCk(int n,int k){
        long numerator=1;
        long denominator=1;
        for(int i=0;i<k;i++){
            numerator=(numerator*(n-i))%MOD;
            denominator=(denominator*(i+1))%MOD;
        }
        return (int)((numerator*modInverse(denominator))%MOD);
    }
    
    long numberOfPaths(int M, int N) {
        // Code Here
        return nCk(M+N-2,M-1);
    }
    
}