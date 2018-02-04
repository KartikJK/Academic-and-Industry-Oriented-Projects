import java.util.Scanner;
class StringReverse
{
static String reverse(String g)
{
String reverse = "";
int length = g.length();
for ( int i = length - 1 ; i >= 0 ; i-- )
reverse = reverse + g.charAt(i);
return reverse;
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter a string to reverse");
String g = in.nextLine();
System.out.println("Reverse of entered string is: "+reverse(g));
}
}