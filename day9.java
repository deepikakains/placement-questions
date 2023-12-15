
Q1.A dress was initially marked at $150, and a pair of jeans were priced at $50. If Emily got a 40% discount off the dress and a 20% discount on the jeans, what was the total percentage she saved on her purchases?
ANS->(B)35%
Q2.You manage a department that includes 10 employees who work with customers, and a supervisor. You notice that one of the employees is regularly late arriving in the morning.
ANS->(c)Ask the supervisor if she's aware of this situation.
Q3.A chef receives 60 orders of pasta, it takes 30 minutes to cook pasta and season one-third of the orders with jalapeno. find out how many pastas can the chef cook in two hours.
ANS->(c)80

Q4.
public class day9{
    public boolean searchEle(int a[],int x){
        int n=a.lenth;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return true;
            }
        }
        return false;
    }
    public boolean insertEle(int a[],int y,int yi){
        int n=a.lenth;
        for(int i=0;i<n;i++){
            if(i==yi){
                a[yi]=y;
                return true;
            }
        }
        return false;
    }
    public boolean deleteEle(int a[],int z){
        int n=a.lenth;
        for(int i=0;i<n;i++){
            if(a[i]==z){
                for(int j=i;j<n-1;j++){
                    a[j]=a[j+1];
                    return false;
                }
            }
            return true;
        }
    }
}

Q5.public class day9{    
    public static void main(String[] args) {       
        int Count1 = 0, Count2 = 0;      
        String str = "Coding is fun";        
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {        
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {        
                Count1++;    
            }       
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                Count2++;    
            }    
        }    
        System.out.println("Number of vowels: " + Count1);    
        System.out.println("Number of consonants: " + Count2);    
    }    
}   
Q6.import java.util.Arrays;  
public class day9{  
    public static void main (String [] args) {  
        String str1="triangle";  
        String str2="integral";  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();    
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();
            Arrays.sort(string1);  
            Arrays.sort(string2);    
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  
}  
*/ 