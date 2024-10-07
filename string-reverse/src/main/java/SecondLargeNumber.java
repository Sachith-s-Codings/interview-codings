public class SecondLargeNumber {
    public static void main(String[] args) {
        int[] nums = {30, 50, 20, -1, 100};
        int secondMax = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i<nums.length; i++){
            max = nums[i];
            if (nums[i] > max){
                secondMax = max;
                max = nums[i];
            }
        }
        System.out.println(secondMax);
    }
}
