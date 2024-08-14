class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                p = i;
                break;
            }
        }
        if (p == -1){
            reverse_r(nums, 0, nums.length - 1);
            return;
        }
        int q = -1;
        for(int i = nums.length-1; i>p; i--){
            if(nums[i]> nums[p]){
                q=i;
                break;
            }
        }
        int c = nums[p];
        nums[p] = nums[q];
        nums[q] = c;
        reverse_r(nums, p+1, q);
        
    }

     public static void reverse_r(int [] nums, int a, int b){
        
        int i = a;
        int j = b;
        while(i<j){
            int c = nums[i];
            nums[i] = nums[j];
            nums[j] = c;
            i++;
            j--;
        
        }
        }

    
     
}
