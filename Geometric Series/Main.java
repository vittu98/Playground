#include<stdio.h>
func(int n)
{
  int i,j=1;
  for(i=1;i<n/2;i++)
  {
    j*=3;
  }
  printf("%d",j);
}
func1(int n)
{
  int i,j=1;
  for(i=0;i<n/2;i++)
  {
    j*=2;
  }
  printf("%d",j);
}
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==0)
    func(n);
  else
    func1(n);
  return 0;
}