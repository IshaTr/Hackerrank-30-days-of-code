import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
 
        for(int i = 0; i < n; i++ ){
           String s = scan.nextLine(); 
           char[] c = s.toCharArray();
           
           for(int j = 0; j < c.length; j=j+2){
               
                    System.out.print(c[j]);
                
            }
            
            System.out.print(" ");
            
            for(int j = 1; j < c.length; j=j+2){
               
                    System.out.print(c[j]);
               
            }
           System.out.println(); 
        }
      scan.close();      
        
    }
}