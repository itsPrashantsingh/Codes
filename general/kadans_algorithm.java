public class kadans_algorithm {
    public static void main(String[] args) {
        int [] nums = {5,-3,5,5,-3,5};
        int max_sum = nums[0];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
            max_sum = Math.max(max_sum, sum);
            if (sum<0){
                sum = 0;
            }   
        }
        System.out.println(max_sum); 
        
    }
    

}