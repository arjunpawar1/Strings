import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author arjun
 */
public class Strings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
     
     ArrayList<String> abc = new ArrayList<>();
          ArrayList<String> abcUpper = new ArrayList<>();
     ArrayList<Integer> value = new ArrayList<>();
        ArrayList<Character> chara = new ArrayList<>();
   //  System.out.println("Please enter any string");
     String word = s.nextLine();
  
     //System.out.println("Please enter any integer");
     int a=s.nextInt();
     
     for(int i =0;i<word.length()-(a-1);i++)
     {
     
       if(Character.isUpperCase(word.charAt(i)))
       {
        String r = word.substring(i, i+a);
         abcUpper.add(r);
       
       }
       else
       {
         String r = word.substring(i, i+a);
         abc.add(r);
       }
     
     }
      
         Collections.sort(abc);
        Collections.sort(abcUpper);
     
        if(abc.size() >=1 && abcUpper.size()>=1)
     {
      
   
        System.out.println(abcUpper.get(0));
         System.out.println(abc.get(abc.size()-1));
    
     }
     
    else if(abc.size()>=1)
     {
     System.out.println(abc.get(0));
             System.out.println(abc.get(abc.size()-1));
     }
     else
     {
          System.out.println(abcUpper.get(0));
             System.out.println(abcUpper.get(abcUpper.size()-1));
     }
    }
}