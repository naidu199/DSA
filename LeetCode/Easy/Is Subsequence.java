class Solution {
    public boolean isSubsequence(String s, String t) {
      int T=t.length();
      int S= s.length();

      if(S==0) return true;
      if(S>T) return false;

      int j=0;

      for(int i=0;i<T;i++){
        if(s.charAt(j)==t.charAt(i)){
            if(j==S-1) return true;
            j++;
        }
      }
      return false;
    }
}
