class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //brute
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
       list.sort((a,b)->b.getValue()-a.getValue());
       int[] answer = new int[k];
       for(int i=0;i<k;i++){
        answer[i]=list.get(i).getKey();
       }
       return answer;
    }
}
