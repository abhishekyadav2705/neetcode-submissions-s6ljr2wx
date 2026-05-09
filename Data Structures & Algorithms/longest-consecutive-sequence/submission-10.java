class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        Set<Integer> set = new HashSet<>();
         for(int num:nums){
            set.add(num);
        }
        int streak=1;
        int longest=1;
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            while(set.contains(currentNum+1)){
                currentNum++;
                streak++;
            }
                longest=Math.max(streak,longest);
                streak=1;
            }
        return longest;
    }
}
