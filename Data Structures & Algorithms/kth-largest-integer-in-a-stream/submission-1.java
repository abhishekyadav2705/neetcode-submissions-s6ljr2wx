class KthLargest {
    int k;
    PriorityQueue<Integer> maxHeap;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums) maxHeap.offer(num);
    }
    
    public int add(int val) {
        maxHeap.offer(val);
        PriorityQueue<Integer> temp = new PriorityQueue<>(maxHeap);
        int ans=-1;
        for(int i=0;i<k;i++){
            ans=temp.poll();
        }
        return ans;
    }
}
