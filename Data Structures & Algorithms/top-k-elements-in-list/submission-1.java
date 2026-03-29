class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //brute force

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b)->b.getValue()-a.getValue());//sortted the list in desc order

        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i]= list.get(i).getKey();
        }
        return result;
    }
}
