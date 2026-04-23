class Solution {
    public int trap(int[] height) {
        int water=0;
        int n=height.length;

        for(int i=0;i<n;i++){
            int leftMax=0, rightMax=0;
            //calculate leftMax
            for(int j=0;j<=i;j++){
                leftMax =Math.max(leftMax,height[j]);
            }
            //calculate rightmax
            for(int j=i;j<n;j++){
                rightMax = Math.max(rightMax, height[j]);
            }

            water += Math.min(leftMax,rightMax)-height[i];
        }
        return water;
    }
}
