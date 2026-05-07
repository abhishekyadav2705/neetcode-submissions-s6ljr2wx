class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
       int max=Integer.MIN_VALUE;
       int appears=nums.length/2;
       for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>max){
            appears=num;
            max=map.get(num);
        }
       }
    
       return appears;
    }
}