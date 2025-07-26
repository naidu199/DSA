// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list=new ArrayList<>();
        generator('0','0',list,n,new StringBuilder());
        return list;
        
    }
    
    public static void generator(char prev,char curr,List<String> list,int n,StringBuilder str){
        if (prev=='1' && curr=='1') {
            return;
        }
        if(str.length() == n){
            list.add(str.toString());
            return;
        }
        str.append('0');
        generator(curr,'0',list,n,str);
        str.deleteCharAt(str.length()-1);
        
        str.append('1');
        generator(curr,'1',list,n,str);
        str.deleteCharAt(str.length()-1);
        
    }
}
