class Solution {
    private boolean search(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int streak=1;
        int longestSequence=1;
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            while(search(nums,currentNum+1)){
                streak++;
                currentNum++;
            }
            longestSequence=Math.max(streak,longestSequence);
            streak=1;
        }
        return longestSequence;
    }
}
