class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)return 0;
        int maxLongest = 1;
         int currentLongest = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue; // skip duplicates
            if (nums[i] == nums[i - 1] + 1) {
                currentLongest++;
            } else {
                maxLongest = Math.max(maxLongest, currentLongest);
                currentLongest=1;
            }
        }
        return Math.max(currentLongest,maxLongest);
    }
}
