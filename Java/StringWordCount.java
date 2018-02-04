import java.util.Scanner;
public class StringWordCount 
{
public static void main(String[] args)
{
//System.out.println("Count words " +countWords("         java     assignment       question"));
Scanner in = new Scanner(System.in);
System.out.println("Enter a string");
String str = in.nextLine();
System.out.println("Count words " +countWords(str));
}

static int countWords(String str)
{        
int a = 0;
char ch[]= new char[str.length()];
for(int i = 0; i < str.length(); i++)
{
ch[i] = str.charAt(i);
if(i+1 < str.length()) 
{
ch[i + 1] = str.charAt(i + 1);
}
if((i+1 < str.length() && (ch[i] != ' ' && ch[i] != '\t') && (ch[i+1] == ' ' || ch[i+1] == '\t')) || (i+1 == str.length() && ch[i] != ' '))
{
a++;
}
}
return a;
}
}