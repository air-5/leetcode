# Question 1. Two Sum

First read official question description on [leetcode.com: Two Sum](https://leetcode.com/problems/two-sum/)

## Quick description
You are given an array `nums` and an int `target`. Return the 2 indices (as an array of size 2) of the two numbers in 
`nums` array that add up to `target`

Example:

```
nums = [2,8,4,3]
target = 11

return [1,3] (because nums[1] + nums[3] = 11)
```

## Brute Force Solution
Check every pair of indices in `nums` and see if they add up to `target`. 
This would take `0(n2) time`, and `O(1) space`

## Optimal Solution
To save time we can use a hashmap to save numbers seen so far and do it in one pass. The hashmap will 
be comprised of keys that are the values in num, and values of each key will be the indice of the value.

So example above we would build a hashmap like the following:

```
k | v
2 | 0
8 | 1
etc...
```

### Algorithm Steps
1. Iterate through the `nums` array
2. For each `num` we calculate the complement (number needed to sum up to `target`) `int complement = target - num[i]`
3. We check if that `complement` is in the hashmap as a key, if it is, then return the result as `new int[] {map.get(complement), i}` else put `num[i], i` into the hashmap.

## Gotchas
Gotcha is to find the `complement` and use a hashmap to see if the `complement` has been seen before.  


## Code Example and Runtime
Documented code example is in the directory [TwoSum.java](TwoSum.java). 

**Runtime:** `o(n)` Time, `o(n)` Space

