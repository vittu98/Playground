#include<stdio.h>
int main()
{
  float r,a,l;
  scanf("%f%f",&r,&a);
  l=(float)(2*3.14*r*a)/360;
  printf("%.2f",l);
}