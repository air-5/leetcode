import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //test case 1.
        int [] test1 = twoSum(new int []{2,8,4,3}, 11);
        System.out.println("test1 solution: [" + test1[0]+ ", " + test1[1] + "]");

        int [] test2 = twoSum(new int []{2,7,11,15}, 9);
        System.out.println("test2 solution: [" + test2[0]+ ", " + test2[1] + "]");
    }

    private static int[] twoSum(int[] nums, int target) {
        if(nums.length < 1) {
            return nums;
        }
        //hash map for <num[i], i> (key will be the int in nums array, and the position that the num was found as value)
        Map<Integer, Integer> map = new HashMap<>();

        //iterate through the nums array
        for (int i = 0; i < nums.length; i++) {
            //for each find the complement int
            int complement = target - nums[i];

            //if complement is in the map, return it as the solution immediately
            if(map.containsKey(complement)) {
                return new int []{map.get(complement), i};
            }
            //otherwise just put the current num and index in the map for storage to see if it will be a complement to another value
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("did not find a two sum solution");
    }
}