##### Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!
Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!

##### Context 
Given a 6 x 6 2D Array, *A*:
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```
We define an hourglass in *A* to be a subset of values with indices falling in this pattern in *A*'s graphical representation:
```
a b c
  d
e f g
```
There are 16 hourglasses in *A*, and an hourglass sum is the sum of an hourglass' values.
  
##### Task 
Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in *n*'s binary representation.
Calculate the hourglass sum for every hourglass in *A*, then print the maximum hourglass sum.
  
##### Input Format
  
A single integer, *n*.
There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array *A*; every value in  will be in the inclusive range of9 to 9.
  
##### Constraints
* 1<= *n* <=10^6
*9 <= *A[i][j]* <= 9
* 0 <= *i,j* <= 5
  
##### Output Format

Print the largest (maximum) hourglass sum found in *A*.

##### Sample Input
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```
##### Sample Output
```
19
```
##### Explanation

*A* contains the following hourglasses:
```
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
```
The hourglass with the maximum sum () is:
```
2 4 4
  2
1 2 4
```

  ##### Answer
  ```java
  import java.io.*;
  public class Solution {
  
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int max = 0;
 
        
        while(n>0){
            int remainder = n%2;
            if(remainder == 1){
                count++;
                if(count>=max){
                    max = count;
                }
      int arr[][] = new int[6][6];
      int hourGlass = 0;
      int max = Integer.MIN_VALUE;
      for(int i=0; i < 6; i++){
          for(int j=0; j < 6; j++){
              arr[i][j] = in.nextInt();
              }
            else {
                count = 0;
      }
      for(int i=1; i<5; i++){
          for(int j=1; j<5; j++){
              hourGlass = arr[i][j] + arr[i-1][j] 
              + arr[i-1][j-1] + arr[i-1][j+1] 
              + arr[i+1][j] + arr[i+1][j-1] 
              + arr[i+1][j+1];
              if(hourGlass>max){
                  max = hourGlass;
              }
              }
            n = n/2;
          }
          System.out.println(max);
      }