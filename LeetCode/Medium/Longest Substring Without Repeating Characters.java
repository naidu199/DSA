class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int i=0,j=0;
       
        int max=0;
        while(j<=s.length()-1){
            char ch=s.charAt(j);
            if(!set.contains(ch)){   
                 set.add(ch);
                 max=Math.max(max,set.size());
                j++;
            }else{
               set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
