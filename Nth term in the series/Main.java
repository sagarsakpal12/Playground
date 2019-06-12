#include<stdio.h>

int main()
{
  	int n,n1,n2;
  	scanf("%d",&n);
  	if(n%2==0)
    {
      	n1=n/2-1;
    } 
    else
    {
      	n2=n/2;
      	n1=n2*2;
    }
    printf("%d",n1); 
}