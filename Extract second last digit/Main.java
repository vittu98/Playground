#include<stdio.h>
int main()
{
  int n,f,m;
  scanf("%d",&n);
 f=n;
  while(n>=1000)
  {
   f=n/10; 
    break;
   }
  f%=10;
  printf("%d",f);
  return 0;
}