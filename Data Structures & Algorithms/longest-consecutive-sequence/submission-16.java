class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int streak=1;
        int longestSequence=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]==nums[i-1]+1){
                streak++;
            }else{
            longestSequence=Math.max(streak,longestSequence);
            streak=1;
        }
        }
        return Math.max(streak,longestSequence);
    }
}
