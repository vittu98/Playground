#include<stdio.h>
int main()
{
    int a[5],i,n,small;
 
    
   
 
    for(i=0 ; i < 4 ; i++)
        scanf("%d",&a[i]);
 
    small = a[0];
 
    for(i = 0 ; i < 4 ; i++)
    {
        if ( a[i] < small )
            small = a[i];
    }
 
    printf("%d",small);
 
  return 0;
}