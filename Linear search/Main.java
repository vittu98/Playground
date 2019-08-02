#include<stdio.h>
int main()
{
  int a[100],i,n,k,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(a[i]==k)
    printf("%d",i+1);
  else
    c++;
  }
  if(c==n)
    printf("%d isn't present in the array.",k);
  
  
  
   
  return 0;
}