class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int s=-1;
        int e=-1;
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(s==-1) s=i;
                else if(e==-1) e=i;
            }
        }

        if(c==0){
            return true;
        }else if(c==2 &&(s1.charAt(s)==s2.charAt(e))&&(s1.charAt(e)==s2.charAt(s))){
            return true;
        }
        return false;
        
    }
}
