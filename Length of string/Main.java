#include<stdio.h>
#include<string.h>
int main()
{
 char s[300];
  int c=0,i;
  scanf("%[^\n]s",s);
 for(i=0;s[i]!='\0';++i)
  {
 if(s[i]!='\0')
  c++;
  }
  printf("%d",c);
  return 0;
}