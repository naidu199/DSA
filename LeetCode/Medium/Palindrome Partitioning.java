class Solution {
    private List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        findSubString(s,0,new ArrayList<>());
        return ans;
    }

    public void findSubString(String s, int idx,List<String> subStr){
        if(idx==s.length()){
            ans.add(new ArrayList<>(subStr));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                subStr.add(s.substring(idx,i+1));
                findSubString(s,i+1,subStr);
                subStr.remove(subStr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String S,int s, int e){
        while(s<=e){
            if(S.charAt(s++)!=S.charAt(e--)){
                return false;
            }
        }
        return true;
    }

}
