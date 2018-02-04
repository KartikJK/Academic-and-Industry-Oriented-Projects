import java.io.*;
import java.util.*;
class logic
{
static Scanner sc=new Scanner(System.in);
void calculate()
{
int a=0,n,m,sum=0;
System.out.println("Enter M");
m=sc.nextInt();
System.out.println("Enter N");
n=sc.nextInt();
if(m<100||m>10000||n>100)
{
System.out.println("Invalid input value");
System.out.println();
}
else
{
int temp=0;
while(m!=0)
{
temp=m%10;
m=m/10;
sum=sum+temp;

if(sum==n)
{
System.out.println("Sum = "+sum);
System.out.println(n);
System.out.println("smallest number whose value equals n="+sum);
break;
}
else
m++;
}
}
}
public static void main(String args[])
{
logic obj=new logic();
obj.calculate();
}
}