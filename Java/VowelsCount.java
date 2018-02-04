public class VowelsCount
{
static int i,c,res;
    
static int vowelcount(String s)
{
for(i=0,c=0;i<s.length();i++)
{
char ch=s.charAt(i);
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
c++;
}
return c ;
}
    
public static void main (String args[])
{
        
System.out.println("Original String is : ");
System.out.println("   ducat is java institute   ");
res=VowelsCount.vowelcount("   ducat is java institute ");
System.out.println("The number of vowels in the string is  :" + res);
}
}

