# Question 5. Longest Palindromic Substring

First read official question description on [leetcode.com: Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-palindromic-substring/)

## Quick description
Given a String `s` find the longest palindrome inside of `s`. 

Example:
```
String s = "babad"
output: "bab" or "aba"
```

## Brute Force Solution
Find every single substring in `s` and check if they are a palindrome and, then return the longest one. Very slow, 
this takes O(n^3) time. 

## Optimal Solution
There are better solutions than this one, but will explain this one since it is the most straightforward in my mind 
and could be implemented easily in an interview. It will be to reverse the string and find the `Longest Common Substring`


### Algorithm Steps
1. Reverse the string into a new variable. 
2. Now run find the `Longest Common Substring` between the two strings. 
3. If you find a common substring between the two, check to make sure the indicies match up to the reversed by doing:
```
reversed.len - revesred[i]
```
4. Then keep track of the longest common substring and return it, that will be the longest palindrome as well.


## Gotchas
* Realizing that reversing the string and finding the `Longest Common Substring`is an optimal solution
* Making sure you check the indicies on the `Longest Common Substring` check (step 4 above)

## Code Example and Runtime
Documented code example is in the directory [LongestSubstringWithoutRepeatingCharacters.java](LongestSubstringWithoutRepeatingCharacters.java). 

**Runtime:** `O(n)` Time, `O(min(m,n))` Space
