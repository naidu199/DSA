import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> count=new HashMap<>();
        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        List<Character> list=new ArrayList<>(count.keySet());
        Collections.sort(list,(a,b)->count.get(b)-count.get(a));

        StringBuilder res= new StringBuilder();

        for(char c: list){
            res.append(String.valueOf(c).repeat(count.get(c)));
        }
        return res.toString();
    }
}
