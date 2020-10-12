# Question 16. Three Sum Closest

First read official question description on [leetcode.com: 3Sum Closest](https://leetcode.com/problems/3sum-closest/)

## Quick description
Given array `int [] nums` and `int target`. Find the sum of three elemens in nums that sum closest to the target.

## Brute Force Solution
Find all triplets of integers in nums and check all the sums and return which one is closer. This will run in o(n3) time.
We can do better. 

## Optimal Solution
2 pointer approach

### Algorithm Steps
1. First sort the input array for algorithm to work `Arrays.sort(nums)`
2. Then create two for loops.
3. Initialize `int p1 = i+1; int p2 = nums.length - 1;`
4. On inner loop calculate the sum of `int sum = nums[i] + nums[p1] + nums[p2];`
5. Increment `p1++` if sum is less than target, and decrement `p2--` if greater than target
6. Then we check if the absolute value of `sum - target` is less than `away` we have seen so far from target
7. If so we set the `away` to this new `sum - target` and set the `finalSum` to that sum
8. return `finalSum` at the end. 

## Gotchas
* Understanding how to solve `3sum` with 2 pointer approach will be crucial
* Keeping track of how many away from target with `away` variable
* Using absolute value so we can keep consistent how many away we are from target

## Code Example and Runtime
Documented code example is in the directory [ThreeSumClosest.java](ThreeSumClosest.java). 

**Runtime:** `O(n2)` Time, `O(n)` Space
