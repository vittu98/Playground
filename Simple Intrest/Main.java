#include<stdio.h>
int main()
{
  int y;
  float p,r,s;
  scanf("%f",&p);
  scanf("%d",&y);
  scanf("%f",&r);
  s=(float)(p*y*r)/100;
  printf("%.6f",s);
  return 0;
}