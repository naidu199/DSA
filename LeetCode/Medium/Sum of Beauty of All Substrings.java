class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map=new HashMap<>(); //we can use array of [26] also
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                 int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(int v:map.values()){
                max=Math.max(max,v);
                min=Math.min(min,v);
            }
            sum+=max-min;
            }
           
        }
        return sum;
    }
}
