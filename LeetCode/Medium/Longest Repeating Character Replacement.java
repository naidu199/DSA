class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int ans=0;
        int maxFq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFq=Math.max(maxFq,map.get(c));

            if((r-l+1)-maxFq>k){
                char l1=s.charAt(l);
                map.put(l1,map.get(l1)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;

        }
        return ans;
    }
}

