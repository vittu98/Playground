#include <stdio.h>
int main() {
	int a,e,f;
  scanf("%d",&a);
  f=a;
  while(a>100)
  {
    a=a/10;
  }
  f=a;
  e=f%10;
  printf("%d",e);
    return 0;
}