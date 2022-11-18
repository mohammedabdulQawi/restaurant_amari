/*Write a program ReplaceTester that encodes a string by replacing all letters "i"
with "!" and all letters "s" with "$". Use the replace method. Demonstrate that
Object Oriented Programming Lab 4
Page 3 of 4
you can correctly encode the string "Mississippi". Print both the actual and
expected result.
*/
public class q3 {
    public static void main (String arge[]){String word = " phrase :";System.out.println("ReplaceTester system:\n word is ::"+ word+"  " );
        System.out.println("Old word is::"+word);
        word = word.replace("i","!");word=word.replace("s","$");
        System.out.println("new word is:"+word);
    }
}
