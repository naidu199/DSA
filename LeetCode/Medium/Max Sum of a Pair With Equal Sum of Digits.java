class Solution {
    public int maximumSum(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int res=-1;
        for(int i:nums){
          int key=calDigitSum(i) ;
            if(map.containsKey(key)){
                 res=Math.max(res,map.get(key)+i);
                map.put(key,Math.max(map.get(key),i));
               
            }else{
                map.put(key,i);
            }
        }
        
return res;
    }

    public int calDigitSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
