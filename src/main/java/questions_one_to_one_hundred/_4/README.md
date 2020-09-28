# Question 4.Median of Two Sorted Arrays

First read official question description on [leetcode.com: Longest Substring Without Repeating Characters](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## Quick description
TODO

## Brute Force Solution
Find every single substring in `s` and check if they have no duplicates, then return the longest one. Very slow, 
this takes O(n^3) time. 

## Optimal Solution
We are going to use the sliding window approach. We will need two pointers `i, and j`, a `max (int)` to hold the max
we've seen so far, and a set to keep track of Characters to avoid duplicates for our solution.

### Algorithm Steps
* Need an `int i = 0`, `int i = 0` as pointers
* `int max = 0` to hold our max seen so far (which will end up being the solutio at the end)
* `Set<Character> set = new HashSet<>();` to hold Characters encountered to avoid duplicates in solution
* Start a while loop `while(i < s.length() && j < s.length()) ` iterate as long as i and j are less than s.length()
* See code walk through for rest of steps

## Gotchas
* Identify using sliding window strategy with two pointers. 
* Making sure you understand all the moves of i and j, and when to remove from set. 

## Code Example and Runtime
Documented code example is in the directory [LongestSubstringWithoutRepeatingCharacters.java](LongestSubstringWithoutRepeatingCharacters.java). 

**Runtime:** `O(n)` Time, `O(min(m,n))` Space
