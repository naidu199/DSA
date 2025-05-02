class Solution {
    public int countGoodNumbers(long n) {
        long mod=1000000007;
        long even=n/2+n%2;
        long odd = n/2;
        return (int) ( (power(5,even)*power(4,odd))%mod);

    }


    public long power(long x,long y){
        long mod=1000000007;
        if(y==0) return 1;
        long p=power(x,y/2);
        p*=p;
        p=p%mod;
        if(y%2==1) p*=x;

        return p%mod;
    }
}
