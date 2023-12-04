public class MaxRectangles {
    int[][] nums;
    MaxRectangles(int[][] nums){
        this.nums= nums;

    }

    public int findMaxRectArea(){
        LargestRectInHist lr = new LargestRectInHist(nums[0]);
        int maxArea = lr.findMaxArea();
        System.out.println("First Area : "+maxArea);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]!=0){
                    nums[i][j] = nums[i][j]+nums[i-1][j];
                }else{
                    nums[i][j] = 0;
                }

            }

            int area = new LargestRectInHist(nums[i]).findMaxArea();
            System.out.println(i+"th area : "+area);
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }
}
