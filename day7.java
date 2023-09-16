1.(A)50
2.
impor java.io.*;
import java.util.*;
public class day7{
    static void reverseWords(String str)
    {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args)
    {
        String str = "jack and jill went up a hill";
        reverseWords(str);
    }
}
3.(B)only II follows
4.(B)II,III
5.output-> 8