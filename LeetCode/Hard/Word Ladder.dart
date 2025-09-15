class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();

        for(String str:wordList){
            set.add(str);
        }

        Queue<Pair> q=new LinkedList<>();

        q.offer(new Pair(beginWord,1));

        set.remove(beginWord);


        while(!q.isEmpty()){
            Pair p=q.poll();
            String word=p.str;
            int steps=p.val;

            if(word.equals(endWord)==true) return steps;

            for(int i=0;i<word.length();i++){
                char[] replace=word.toCharArray();
                for(char c='a';c<='z';c++){
                    replace[i]=c;
                    String newStr=new String(replace);

                    if(set.contains(newStr)){
                        set.remove(newStr);
                        q.offer(new Pair(newStr,steps+1));
                    }
                }
            }
        }
        return 0;

    }
}


class Pair{
    String str;
    int val;
    Pair(String s,int v){
        str=s;
        val=v;
    }
}
