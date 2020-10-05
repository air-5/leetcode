# Question 7. Reverse Integer

First read official question description on [leetcode.com: Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Quick description
Given an `int x` return an `int` in reverse order

Examples:
```
int x = 124
output: 421
```

```
int x = -124
output: -421
```

## Brute Force Solution
Convert to string, reverse it, then convert back to integer and make sure it doesn't overflow. 

## Optimal Solution
For this time, I am going to do the brute force solution as it is easy to understand.

### Algorithm Steps
1. Check if `x` is negative, save that answer to a boolean variable
2. Convert int `x` to string 
3. If negative remove the negative sign from of the front string
4. Create try catch and check if parsing to int will result in an exception. If so return `0`
5. Return the new int at the end of the method, negating it if negative boolean variable is true

## Gotchas
* Handling the negative scenario (remember that `string.substring(1)` removes first char from string)
* Making sure you check for Integer overflow with the try catch senario
* Make sure you add the negative sign back to the int at the end if it is a negative int

## Code Example and Runtime
Documented code example is in the directory [ReverseInteger.java](ReverseInteger.java). 

**Runtime:** `O(n)` Time, `O(n)` Space
