class Solution {
    public boolean checkString(String s) {
        boolean ans=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                ans=true;
            }
            if(ans){
                if(s.charAt(i)=='a'){
                    return false;
            }
            }
        }
        return true;
    }
}
