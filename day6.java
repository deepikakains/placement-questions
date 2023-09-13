1.(A)Subjugete
2.(A)RWDNXZS
3.(B)29
4.(B)7.14%
5.
public class day6{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(i*2-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=7;i>=1;i-=2){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}