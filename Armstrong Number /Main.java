
#include <stdio.h>
#include <math.h>

 
int main()
{
    int n1, onum, r, result = 0, n = 0 ;
    scanf("%d", &n1);

     onum = n1;
    
    while (onum != 0)
    {
        onum /= 10;
        ++n;
    }

    onum = n1;

    while (onum != 0)
    {
        r = onum % 10;
        result += pow(r, n);
        onum /= 10;
    }

    if(result == n1)
        printf("Armstrong Number");
    else
        printf("Not an Armstrong Number");

    return 0;
}