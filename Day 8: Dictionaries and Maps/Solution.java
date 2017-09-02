import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        HashMap<String, Integer> phoneDirectory = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneDirectory.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneDirectory.containsKey(s)){
                int phone = phoneDirectory.get(s);
                System.out.println(s +"="+ phone);
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}