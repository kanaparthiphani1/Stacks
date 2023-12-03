public class RainWaterTrapping {
    int[] nums;
    RainWaterTrapping(int[] nums){
        this.nums = nums;
    }

    public int total(){
        int l = 0;
        int r = this.nums.length-1;
        int lmax = 0;
        int rmax = 0;
        int total = 0;

        while (l<=r){
            if(nums[l]<=nums[r]){
                if(nums[l]>=lmax){
                    lmax = nums[l];
                    l++;
                }else{
                    total = total + (lmax - nums[l]);
                    l++;
                }
            }else{
                if(nums[r]>=rmax){
                    rmax = nums[r];
                    r--;
                }else{
                    total = total + (rmax - nums[r]);
                    r--;
                }
            }

        }
        return total;
    }
}
