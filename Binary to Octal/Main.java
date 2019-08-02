#include<stdio.h>
#include<math.h>
int main()
{
  int n,i=0,d,b=0;
  scanf("%d",&n);
  while(n!=0)
  {
    d=n%10;
    b=b+(d*pow(2,i));
    n=n/10;
    i++;
  }
  //printf("%d",b);
 int a[100],k=0,l;
  while(b!=0)
  {
    a[k++]=b%8;
    b/=8;
   }
  for(l=k-1;l>=0;l--)
  {
    printf("%d",a[l]);
  }
  return 0;
}