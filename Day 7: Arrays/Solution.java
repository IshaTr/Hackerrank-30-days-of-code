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