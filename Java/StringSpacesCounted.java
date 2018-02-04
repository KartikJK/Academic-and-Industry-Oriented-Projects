import java.util.Scanner;
public class StringSpacesCounted
{
public static void main(String[] args)
{
//System.out.println("Count words " +countWords("         java     assignment       question"));
Scanner in = new Scanner(System.in);
System.out.println("Enter a string");
String str = in.nextLine();
System.out.println("Counted Spaces " +countedSpaces(str));
}


static int countedSpaces(String str)
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
//if((i+1 < str.length() && (ch[i] != ' ' && ch[i] != '\t') && (ch[i+1] == ' ' || ch[i+1] == '\t')) || (i+1 == str.length() && ch[i] != ' '))
if((i+1 < str.length() || (ch[i] == ' ' || ch[i] == '\t') || (ch[i+1] != ' ' && ch[i+1] != '\t')) && (i+1 != str.length() || ch[i] == ' '))
{
a++;
}
}
return a;
}

}