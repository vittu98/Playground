#include <stdio.h>
int main() {
	int a,b,f,s=0;
  scanf("%d%d",&a,&b);
  b=a%10;
  f=a;
  while(a>10)
  {
    a/=10;
  }
  f=a;
  s=f+b;
  printf("%d",s);
	return 0;
}