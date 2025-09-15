class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>();

        for(String str: wordList){
            set.add(str);
        }

        List<String> used=new ArrayList<>();
        used.add(beginWord);
        List<List<String>> ans=new ArrayList<>();
        int level=0;
        Queue<List<String>> q=new LinkedList<>();
        List<String> start = new ArrayList<>();
        start.add(beginWord);
        q.offer(start);
        int shortest = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            List<String> list=q.poll();

            if(list.size()>level){
                level++;
                for(String s: used){
                    set.remove(s);
                }
                used.clear();
                if (level > shortest) break;
            }
            String word=list.get(list.size()-1);
            if (word.equals(endWord)) {
                if (list.size() <= shortest) {
                    shortest = list.size();
                    ans.add(new ArrayList<>(list));
                }
            }

            for(int i=0;i<word.length();i++){
                char[] arr=word.toCharArray();
                for(char c='a';c<='z';c++){
                    arr[i]=c;
                    String newWord=new String(arr);
                    if(set.contains(newWord)){
                        list.add(newWord);
                        List<String> t=new ArrayList<>(list);
                        q.offer(t);
                        used.add(newWord);
                        list.remove(list.size()-1);
                    }
                }
            }
        }

        return ans;
    }
}
