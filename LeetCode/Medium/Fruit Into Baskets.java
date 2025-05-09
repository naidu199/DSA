class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while( r < fruits.length){
            int r1=fruits[r];
            map.put(r1,map.getOrDefault(r1,0)+1);
            if(map.size()>2){
                    int l1=fruits[l];
                    map.put(l1,map.get(l1)-1);
                    if(map.get(l1)<=0) map.remove(l1);
                    l++;  
            }
            if(map.size()<=2){
               maxLen=Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
