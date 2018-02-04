public class StringRightTrim
{
static int i,j;
static void rtrim(String s)
{
for(i=s.length()-1;i>=0;i--)
{
char ch=s.charAt(i);   
if(ch!=' ')
break;
}
for(j=0;j<i+1;j++)
System.out.print(s.charAt(j));
}
public static void main (String args[])
{
System.out.println("Original String is : ");
System.out.println("   ducat java institute   ");
StringRightTrim.rtrim("   ducat java institute    ");
}
}

