#include<stdio.h>
#include<string.h>
int main()
{
	char a[50];
int i,c=0;
  scanf("%s",a);
   for(i=0;a[i]!='\0';i++);
       if(i>20)
      printf("Invalid Input");
   
   else
   {
  for(i=0;a[i]!='\0';i++)
   {
    if(a[i]==a[i+1])
    {  
      c++;
    }
    else
    {
      printf("%c%d",a[i],c+1);
      c=0;
    }
   }
   }
  return 0;
}