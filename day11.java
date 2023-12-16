Q1.One person start from his home towards college which is 53 km far away. Another person
started from college towards home after an hour. the speed of first one is 4kmph and the second
one is 3 kmph. Then, what is the distance from home to their meeting point?
ANS->(D)21km
Q2.What will be the output of this pseudocode ?
main()
{
unsigned int i;
for(i=1;i>-2;i--)
printf("HCL Technologies");
}
ANS->(d)none
Q3.If each of the two parties of knights consists of exactly three members, which of the following
is not a possible travelling party and route?
ANS->(B)P,S,T by northern route
Q4.What can be said of the following program?
main()
{
enum Months {JAN =1,FEB,MAR,APR};
Months X = JAN;
if(X==1)
{
printf("Jan is the first month");
}
}
ANS->(b)prints:Jan is the first month
Q5.
import java.util.*;
public class day11{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two integer");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        float q=a1/a2;
        System.out.println("Quotient of two integer=" + q);
    }
}
Q6.
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class day11 extends Frame 
{
	Shape circle=new Ellipse2D.Float(100.0f,100.0f,100.0f,100.0f);
	
	public void paint(Graphics g)
	{
		Graphics2D ga=(Graphics2D)g;
		ga.draw(circle);
		ga.setPaint(Color.blue);
		ga.fill(circle);
	}
		
	public static void main(String args[])
	{
		Frame frame=new day11();
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
		    }
		});
		frame.setSize(300, 250);
		frame.setVisible(true);	
	}
}

