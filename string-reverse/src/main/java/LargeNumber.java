public class LargeNumber {
    public static void main(String[] args) {
        int[] nums = {-50,0,1,2,3,4,5,90};
        int max = nums[0];
        int min = nums[0];

        for (int i=0; i<nums.length; i++){
            if (max<nums[i]){
                max=nums[i];
            }
            if (min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("Large num = " + max);
        System.out.println("Minimum num = " + min);
    }

}
