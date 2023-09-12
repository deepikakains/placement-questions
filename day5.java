1.(c)52500
2.(d)Statement 2 is the cause and statement 1 is the effect
3.(b)financial success without emotional balance can cause havoc in a person's life
4.
import java .util.*;
public class day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number until you want to print");
        int n=sc.nextInt();
        int m1=0,m2=1;
        System.out.print(m2);
        for(int i=2;i<=n;++i){
            int m3=m1+m2;
            System.out.print(" "+ m3);
            m1=m2;
            m2=m3;
        }
    }
}

5.(2)O(logn)
6.(d)eu
7.NO