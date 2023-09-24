1.(A)73-> father's age 
     37-> son's age
2(C)10 //Reason-> No matter how many lions are there it will always be 10 minutes
3.
#include<stdio.h>
int main(void){
    int a=5;
    printf("(%d*)(++%d)=%d,a=%d\n",a,a,(++a)*(++a),a);//(7*)(++7)=49,a=7
    a=5;
    printf("(%d++)*(%d++)=%d,a=%d\n",a,a,(a++)*(a++),a);//(7++)*(7++)=30,a=7
    a=5;
    printf("(++%d)*(%d++)=%d,a=%d\n",a,a,(++a)*(a++),a);//(++7)*(7++)=42,a=7
    a=5;
    printf("(%d++)*(++d)=%d,a=%d\n",a,a,(a++)*(++a),a);//(7++)*(++d)=7,a=35
    return 0;
}
4.(B)Hammer
5.(C)The statement | is the cause and statement || is the effect. 