#include <stdio.h>
#include<math.h>
int main()
{
 float a,b,e;
  scanf("%f %f",&b,&e);
  if(e<0)
    printf("Wrong input");
  else if(e==0)
    printf("1");
 else
  {
    a=pow(b,e);
  printf("%f",a);
  
}
    return 0;
}