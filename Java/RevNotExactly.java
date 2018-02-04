public class RevNotExactly
{
static String ReverseNotExactly(String str) 
{
char charArray[] = str.toCharArray();
for (int i = 0; i <str.length(); i++)
{
if(charArray[i] == ' ')
return ReverseNotExactly(str.substring(i + 1)) + str.substring(0, i) + " ";
}
return str + " ";
}

public static void main(String[] args)
{
String s="hello brave new world";
System.out.println("reverse of sentence:"+ReverseNotExactly(s));
}
}