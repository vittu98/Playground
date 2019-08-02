#include<stdio.h>
int main()
{
  int a,b,h,l;
  scanf("%d%d",&a,&b);
  for(int i=1;i<=a && i<=b;i++)
  {
    if(a%i==0 && b%i==0)
      h=i;
  }
  l=(a*b)/h;
  printf("%d",l);
  return 0;
}