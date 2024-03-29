##### Objective 
Today, we're learning and practicing an algorithmic concept called Recursion. Check out the Tutorial tab for learning materials and an instructional video!

##### Task 
Write a factorial function that takes a positive integer, *N* as a parameter and prints the result of *N!* ( *N*factorial).

##### Note: 
If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.

##### Input Format

A single integer, *N* (the argument to pass to factorial).

##### Constraints
* 2 <= *N* <=12
* Your submission must contain a recursive function named factorial.

##### Output Format

Print a single integer denoting *N!*.

##### Sample Input
```
3
```
##### Sample Output
```
6
```
##### Answer
```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        if(n>1){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

```