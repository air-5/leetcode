# Question 2. Add Two Numbers

First read official question description on [leetcode.com: Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Quick description
Basically you are given two linked lists `l1` and `l2`
```
l1 = 2 -> 4 -> 3
l2 = 5 -> 6 -> 4
```

They are in reverse order, so actual numbers are `342`, and `465`. They want you to return the sum as a reversed linked
list.

Example:

```
Since:
342 + 465 = 807

return 7 -> 0 -> 8 
```

## Brute Force Solution
Convert each linked list into a String. Then convert those strings into two integers. Sum those two integers, take the 
sum and convert it into a string. Take that string and iterate through it in reverse order and create a new linked 
list out of each character. TOO COMPLEX, and takes too much extra space! Let's look at the optimal solution 

## Optimal Solution
Try stacking the linked lists on top of each other, and do elementary math working from left to right. 
```
 2 -> 4 -> 3
 5 -> 6 -> 4
+___________
 7 -> 0 -> 8 

Note: remember the carry the 1 rule
```

### Algorithm Steps
* Need an initial `int carry = 0` and `ListNode resList = new ListNode(0);` to hold our solution. 
* Implement a while loop to iterate through both lists at the same time.
* Get `l1.val` and `l2.val` and sum them.
    * If `sum > 9` set carry to 1, and `%10` the sum to be added to the linkedList
    * else set carry to 0, and leave sum alone to be added to the linkedList

## Gotchas
* Solve it elementary math style but in reverse.
* Don't forget to check for nulls if the lists are not the same length so we don't get NPE when trying to sum.
* Don't forget to increment the linked list along at the end of your while loop

## Code Example and Runtime
Documented code example is in the directory [AddTwoNumbers.java](AddTwoNumbers.java). 

**Runtime:** `o(max(m,n))` Time, `o(max(m,n))` Space
