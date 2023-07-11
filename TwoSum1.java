public class TwoSum1 {
    public int[] twoSum(int[] nums,int target ){
        for(int i=0;i<nums.length-1;i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[] { i, j };
                }    
            }
        }
        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }
    public static void main(String[] args){
        TestSum1 twoSum=new TestSum1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to the target sum:");
        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);
    }
}
