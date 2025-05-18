class Solution {
    public int minDeletion(String s, int k) {
        int[] ans=new int[26];

        for(char c:s.toCharArray()){
            ans[c-'a']++;
        }
        Arrays.sort(ans);
        int i=25-k;
        int c=0;
        while(ans[i]>0) {
            c+=ans[i];
            i--;
        }
        return c;
    }
}
