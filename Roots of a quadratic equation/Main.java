#include<stdio.h>
#include<math.h>
int main()
{
 float a,b,c,d,r1,r2,r3,r4,r5,r6;
  scanf("%f%f%f",&a,&b,&c);
  d=((b*b) - (4*a*c));
  if(d>0)
  { 
    r1=(float)((-b + sqrt(d))/(2*a));
        r2=(float)((-b - sqrt(d))/(2*a));
                   printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(d==0)
  {
    r3= (float)(-b/(2*a));
    r4= (float)(-b/(2*a));
    printf("root1 = %.2f  root2 = %.2f",r3,r4);
    }
  else
  {
    r5=(-b/(2*a));
    r6=sqrt(-d)/(2*a);
    printf("root1 = %.2f + %.2fi  ",r5,r6);
           printf("root2 = %.2f - %.2fi",r5,r6);
  }
 
               return 0;
}