#include<stdio.h>
int main()
{
  int i,n,n1=1,n2=2,n3;
  scanf("%d",&n);
  for(i=1;i<n-1;i++)
  {
    n3=n1+n2;
    n1=n2;
    n2=n3;
  }
  printf("%d",n3);
}