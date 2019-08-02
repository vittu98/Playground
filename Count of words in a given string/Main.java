#include<stdio.h>

int main()
{
  char s[300],i,c=0;
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==32)
      c++;
  }
  printf("%d",c+1);
}