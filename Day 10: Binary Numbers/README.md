
##### Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

##### Task 
Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in *n*'s binary representation.

##### Input Format

A single integer, *n*.

##### Constraints
* 1<= *n* <=10^6

##### Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of .

##### Sample Input 1
```
5
```
##### Sample Output 1
```
1
```
##### Sample Input 2
```
13
```

##### Sample Output 2
```
2
```
##### Answer
```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int max = 0;
 
        
        while(n>0){
            int remainder = n%2;
            if(remainder == 1){
                count+;
                if(count>=max){
                    max = count;
                }
            }
            else {
                count = 0;
            }
            n = n/2;
        }
        System.out.println(max);
    }
}

```
