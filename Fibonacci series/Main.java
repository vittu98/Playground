#include<stdio.h>
int main()
{
  int i,n,f=0,s=1,t;
  scanf("%d",&n);
  printf("0 1 ");
  for(i=2;i<n;i++)
  {
    t=f+s;
    printf("%d ",t);
    f=s;
    s=t;
  }
  return 0;
}