class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");

        String str="";
        for(int i=words.length-1;i>=0;i--){
            str +=words[i];
            if(i!=0){
                str+=" ";
            }
        }

        return str;

    }

}
