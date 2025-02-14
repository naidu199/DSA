class ProductOfNumbers {
    ArrayList<Integer> arr;
    int p=1;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            arr= new ArrayList<>();
            p=1;
            return;
        }
        p=p*num;
        arr.add(p);
    }
    
    public int getProduct(int k) {
        int n=arr.size();
        if(n<k) return 0;
        int ans=arr.get(n-1);

        if(n==k) return ans;
        else {
            ans= ans / arr.get(n-k-1);
            return ans;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
