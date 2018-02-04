public class SqueezeString
{
static int i;
    
static void squeeze(String s)
{
for(i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch != ' ')
System.out.print(ch);
}
}
    
    
public static void main (String args[])
{
System.out.println("Original String is : ");
System.out.println("   ducat is java institute   ");
SqueezeString.squeeze("   ducat is java institute    ");
}
}

