#include<stdio.h>
int main()
{
  int d;
  float r,a;
  scanf("%d",&d);
  r=(float)d/2;
  a=(float)3.14*r*r;
  printf("%.2f",a);
  /*int d,r;
  
  float b,a,pi=3.14;
  scanf("%d",&d);
  r=d/2;
  if(r%10==0)
  {
  b=r*r*pi;
  printf("%0.2f",b);
    
  }
  else
  {
  a=(float)r*r*pi;
  printf("%.2f",a);
  }
*/
}