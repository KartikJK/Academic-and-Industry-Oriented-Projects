public class CountCharacters
{
static int a=0;
    
static int charcount(String s)
{
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
char chr=s.charAt(i+1);
if(ch!=' '&& ch!='\t')
a++;

}
return a;
}
    
public static void main (String args[])
{
System.out.println("Count characters " +charcount("ducat is part of	s.o.infotech"));
}
}