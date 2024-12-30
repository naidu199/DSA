class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        
       String[] list=s.split("\\s+");
       String str="";
       for(int i=list.length-1;i>=0;i--){
        
           str+=list[i];
           str+=" ";
       }
       str=str.trim();
       return str;
    }
}
