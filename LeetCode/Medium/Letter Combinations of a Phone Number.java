class Solution {
    private List<String> res;
    private String[] maps;
    public List<String> letterCombinations(String digits) {
        res=new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        maps=new String[]{
            "","",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        findcombs(digits,0,new StringBuilder());
        return res;
    }

    public void findcombs(String digits,int i,StringBuilder str){
        if(i==digits.length()){
            res.add(str.toString());
            return;
        }

        String letters=maps[digits.charAt(i)-'0'];

        for(char c : letters.toCharArray()){
            str.append(c);
            findcombs(digits,i+1,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
