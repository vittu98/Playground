#include<stdio.h>
int main()
{
  char a[30],b[30],c[30];
  int i;
  scanf("%s%s%s",a,b,c);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]=='a' || a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='A' ||a[i]=='E' ||a[i]=='I' ||a[i]=='O' || a[i]=='U')
    {
      a[i]='$';
    }
    printf("%c",a[i]);
  }
  for(i=0;b[i]!='\0';i++)
  {
    if(b[i]!='a' && b[i]!='e' && b[i]!='i' && b[i]!='o' && b[i]!='u'&& b[i]!='u'&& b[i]!='A'&& b[i]!='E'&& b[i]!='I'&& b[i]!='O'&& b[i]!='U')
    {  
      b[i]='#';
    }
     printf("%c",b[i]);
  
  }
  for(i=0;c[i]!='\0';i++)
  {
    if(c[i]>='a' && c[i]<='z')
      c[i]-=32;
   printf("%c",c[i]);
  }
  //printf("%s",a);
return 0;
}