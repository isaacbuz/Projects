/* Program to reverse String using Stack.
*/

import java.util.Stack;


public class ReverseString

{

   public static void main(String[] args) {


       String stringExample  =  "This is good";

       System.out.println("Original string: "+stringExample);

       int n = stringExample.length(); // length of String


       Stack<Character> stack = new Stack<>(); // Creating a stack object


       for(int i=0;i<n;i++){

           // inserting characters of string one by one

           stack.push(stringExample.charAt(i));

       }

       String reversedString = "";


       // popped characters will be in reversed order

       while(!stack.isEmpty()){

           reversedString+=stack.pop();

       }


       System.out.println("Reversed string: "+reversedString); // Printing the reversed string

   }

}