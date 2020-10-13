# Question 17. Letter Combinations of a Phone Number

First read official question description on [leetcode.com: Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

## Quick description
Read description here: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

## Solution
Recursive algorithm going through each number in the input and matching all possible letters with 
all possible letters for each number.

### Algorithm Steps 
1. First initialize a map that contains the key (phone number), and values are the letters that map to the number
2. Create the recursive method with two parameters `(String combination, String next_digits)`
3. Simple if/else structure inside the recursive method, inside the if we check if next_digits is length == 0
if it is, then we add the current combination.
4. If next_digits is not empty, then we grab the digit, the letters associated with that digit. 
5. Then iterate with a for loop over those letters, and for each letter in letters we recurse with: `recMethod(combination + letter, next_digits.substring(1));`

## Gotchas
* Identifying that we should use recursion, and the loop inside the recursive function to map each letter appropriately 
* `str.substring(0, 1)` returns the first character as a string in `str`
* `str.substring(1)` returns the last character in `str` if str is atleast 2 characters, or "" if a string is just one character long

## Code Example and Runtime
Documented code example is in the directory [LetterCombinationsPhoneNumber.java](LetterCombinationsPhoneNumber.java). 

**Runtime:** `O(3^N x 4^M)` Time, `O(3^N x 4^M)` Space
