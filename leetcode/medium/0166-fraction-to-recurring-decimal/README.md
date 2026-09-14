# Fraction to Recurring Decimal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers representing the `numerator` and `denominator` of a fraction, return  *the fraction in string format*.

If the fractional part is repeating, enclose the repeating part in parentheses

If multiple answers are possible, return  **any of them**.

It is  **guaranteed**  that the length of the answer string is less than `104` for all the given inputs.

 **Note**  that if the fraction can be represented as a  *finite length string*, you  **must**  return it.

 

 **Example 1:** 

```
Input: numerator = 1, denominator = 2
Output: "0.5"

```

 **Example 2:** 

```
Input: numerator = 2, denominator = 1
Output: "2"

```

 **Example 3:** 

```
Input: numerator = 4, denominator = 333
Output: "0.(012)"

```

 

 **Constraints:** 

- -231 <= numerator, denominator <= 231 - 1
- denominator != 0

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 51.53%)  
**Memory:** 42.9 MB (beats 10.89%)  
**Submitted:** 2026-09-14T09:21:51.678Z  

```java
import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

     
        if (numerator == 0) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();


        if ((numerator < 0) ^ (denominator < 0)) {
            ans.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        ans.append(num / den);

        long remainder = num % den;

        if (remainder == 0) {
            return ans.toString();
        }

        ans.append(".");

        HashMap<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {

            if (map.containsKey(remainder)) {
                int position = map.get(remainder);
                ans.insert(position, "(");
                ans.append(")");
                break;
            }

            
            map.put(remainder, ans.length());

            remainder *= 10;

            ans.append(remainder / den);

            remainder %= den;
        }

        return ans.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/fraction-to-recurring-decimal/)