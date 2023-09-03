/*
1.There is an unlimited stock of Blue, Red, White and Grey coloured balls. The 
balls of each colour are idenƟcal. Find the number of ways of selecƟng 12 
balls from the stock? 
ans- (d)455

2.THe mangoes will ripen over time said Ashok.

3.(c)441

4.(d)15
*/
import java .util.*;
public class day1{
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the ph of an solution");
        float ph=sc.nextFloat();
        if (ph<7){
            System.out.println("Acidic");
        }
        else if(ph>7){
            System.out.println("Alkaline");
        }
        else{
            System.out.println("Neutral");
        }
    }
}