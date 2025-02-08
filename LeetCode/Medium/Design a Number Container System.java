class NumberContainers {

    HashMap<Integer,Integer> map;
    HashMap<Integer,SortedSet<Integer>> sortedIdx;

    public NumberContainers() {
        map= new HashMap<>();
        sortedIdx=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(!sortedIdx.containsKey(number)){
           sortedIdx.put(number,new TreeSet<>());
        }

        if(map.containsKey(index)){
            if(map.get(index)==number) return;
            int pre=map.get(index);
            sortedIdx.get(pre).remove(index);
        }
        sortedIdx.get(number).add(index);
        map.put(index,number);
    }
    
    public int find(int number) {
        if(sortedIdx.containsKey(number)&& !sortedIdx.get(number).isEmpty()){
          return  sortedIdx.get(number).first();
        }else{
           return  -1;
        }
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
