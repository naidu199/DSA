class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }

        int[] list=new int[256];
        int l=0,r=0;
        int minLen=Integer.MAX_VALUE;
        int sI=-1;
        int count=t.length();
        for(char c: t.toCharArray()){
            list[c]++;
        }

        while(r<s.length()){
            if(list[s.charAt(r++)]-->0){
                count--;
            }
            while(count==0){
                if(r-l < minLen){
                    sI=l;
                    minLen=r-l;
                }
                if(list[s.charAt(l++)]++==0){
                    count++;
                }
            }
        }

        return sI==-1?"":s.substring(sI,sI+minLen);
    }
}
