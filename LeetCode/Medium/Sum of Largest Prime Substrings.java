import java.util.*;
class Solution {
    public long sumOfLargestPrimes(String s) {
        long sum=0;
        Set<Long> set=new HashSet<>();
        int len=s.length();
        if(len==0){
            return sum;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String sub=s.substring(i,j);
                long num=Long.parseLong(sub);
                if(isPrime(num)){ 
                    set.add(num);
                }
            }
        }
        List<Long> list=new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        
        for(int i=0;i<Math.min(3,list.size());i++){
            sum+=list.get(i); 
        }
        return sum;
    }
    
    public boolean isPrime(long n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        long s=(long)Math.sqrt(n);
        
        for(int i=3;i<=s;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
