import java.util.Scanner;
public class StringSpaceCount 
{
public static void main(String[] args)
{
//System.out.println("Count words " +countWords("         java     assignment       question"));
Scanner in = new Scanner(System.in);
System.out.println("Enter a string");
String str = in.nextLine();
System.out.println("Counted spaces " +countSpace(str));
}

static int countSpace(String str)
{        
int a = 0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if((ch==' ')||(ch=='\t'))
a++;
}

return a;
}
}