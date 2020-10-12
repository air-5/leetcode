package questions_one_to_one_hundred._16;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int [] nums = new int []{-1,2,1,-4};
        int target = 1;
        System.out.println("res " + threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        //todo validation of input

        int away = Integer.MAX_VALUE;
        int finalSum = 0;

        Arrays.sort(nums);
        //[-4,-1,1,2]

        for(int i = 0; i < nums.length - 2; i ++) {
            int p1 = i+1;
            int p2 = nums.length - 1;
            System.out.println("p1 in i loop " + p1);
            System.out.println("p2 in i loop " + p2);
            System.out.println("away in i loop " + away);
            for(int j =0; j < nums.length; j++) {
                int sum = nums[i] + nums[p1] + nums[p2];
                System.out.println("sum in j loop " + sum);
                if(sum < target) {
                    p1 ++;
                } else if(sum > target) {
                    p2 --;
                }

                if(Math.abs(sum - Math.abs(target)) < away) {
                    away = Math.abs(sum - Math.abs(target));
                    finalSum = sum;
                }
                System.out.println("p1 in j loop " + p1);
                System.out.println("p2 in j loop " + p2);
                //break condition
                if(p1 == p2) break;

            }

        }


        return finalSum;
    }
}
