##### Objective 
Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!

##### Task 
Given an array, *A*, of *N* integers, print *A*'s elements in reverse order as a single line of space-separated numbers.

##### Input Format

The first line contains an integer, *N* (the size of our array). 
The second line contains *N* space-separated integers describing array *A*'s elements.

##### Constraints
* 1 <= *N* <= 1000
* 1 <= *Ai* <= 10000, where *Ai* is the *ith* integer in the array.

##### Output Format

Print the elements of array *A* in reverse order as a single line of space-separated numbers.

##### Sample Input
```
4
1 4 3 2
```

##### Sample Output
```
2 3 4 1
```

##### Answer
```java
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        String output = "";
        
        for(int i=arr.length-1; i>=0; i--){
           output = output + arr[i] + " ";
        }
        System.out.println(output);
        in.close();
    }
}
```