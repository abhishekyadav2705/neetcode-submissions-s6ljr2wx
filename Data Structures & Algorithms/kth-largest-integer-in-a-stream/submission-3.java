class KthLargest {
    int k;
    List<Integer>list;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        list= new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list,Collections.reverseOrder());
        return list.get(k-1);
    }
}
