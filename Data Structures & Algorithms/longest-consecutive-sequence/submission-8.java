class Solution {
    private boolean binarySearch(int[] nums, int target){
        int left=0;
        int right =nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int streak=1; int longestConsecutive=1;
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            while(binarySearch(nums,currentNum+1)){
                currentNum++;
                streak++;
            }
           longestConsecutive=Math.max(streak,longestConsecutive);
           streak=1;
            }
         return longestConsecutive;
    }
}