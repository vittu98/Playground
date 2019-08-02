#include <stdio.h>
int main() {
 int c,d,s=0;
  scanf("%d",&c);
  while(c>0)
  {
    d=c%10;
    s+=d;
    c=c/10;
  }
  printf("%d",s);
	return 0;
}