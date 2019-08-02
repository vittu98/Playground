#include<stdio.h>
#include<math.h>
int main()
{
  int f,i=0,d,b,c=0,e=0;
  scanf("%d",&b);
  while(b!=0)
  {
    d=b%10;
    e=e+d*pow(2,i);
   //g+=e;
    b/=10;
    i++;
 }
   printf("%d",e);
  
  
  
    
    
    return 0;
}