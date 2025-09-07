class Solution {
    private Map<String, Boolean> memo = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        String key = s1 + "-" + s2;
        if (memo.containsKey(key)) return memo.get(key);

        char[] st1=s1.toCharArray();
        char[] st2=s2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        if(!Arrays.equals(st1,st2)){
            memo.put(key, false);
            return false;
        }

        for(int i=1;i<s1.length();i++){
            String s1left=s1.substring(0,i);
            String s1right=s1.substring(i);
            String s2left=s2.substring(0,i);
            String s2right=s2.substring(i);

            if(isScramble(s1left,s2left) && isScramble(s1right,s2right)){
                memo.put(key, true);
                return true ;
            }
            int len=s1.length();
            String s2left_no=s2.substring(0,len-i);
            String s2right_no=s2.substring(len-i);

            if(isScramble(s1left,s2right_no) && isScramble(s1right,s2left_no)){
                memo.put(key, true);
                return true ;
            }
        }
        memo.put(key, false);
        return false;
    }
    
}
