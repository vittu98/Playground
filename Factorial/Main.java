#include<stdio.h>
int main()
{
long int n,fact=1;
  scanf("%ld",&n);
  if(n==0)
       printf(1);
 while(n>0)
  {
 
      fact*=(n);
    n--;
    
  
  }
  printf("%ld",fact);
  
}