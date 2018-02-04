public class WordReverse
{
public static void main(String args[])
{
System.out.println(reverseString(str));
}
static String reverseString(String str) 
{
// the simpliest splitting. Think about ".,!?" symbols
String[] words = str.split(" ");
StringBuilder sb = new StringBuilder();
for (int i = words.length - 1; i > 0 ; i--) 
{
// Here space symbol may be enhanced to more difficult cases ".?,"
sb.append(words[i]).append(" ");
}
// to delete last space symbol call trim() function.
return sb.toString().trim();
}
}