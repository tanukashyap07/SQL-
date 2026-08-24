# 1. Loops - Odd Numbers (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You have to keep taking integers as input until you get an odd number as input. Your output will be N, which represents the number of numbers you had to take as input uptill encountering an odd number.

 **Input Format** 

You will be given `N-1` even numbers followed by an odd number.

 **Constraints** 

1 <= N <= 100000

 **Output Format** 

For each test case print the value of `N` in a new line.

```
Example 1

```

Input

4

8

6

10

12

13

Output

6

Explanation

The sixth integer was an odd number.

```
Example 2

```

Input

8

13212

332

134

4418

909

Output

6

Explanation

The sixth integer was an odd number.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T04:47:14.964Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            int n = sc.nextInt();
            count++;

            if (n % 2 != 0) {
                break;
            }
        }

        System.out.println(count);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/1-loops-odd-numbers-cw/problem)