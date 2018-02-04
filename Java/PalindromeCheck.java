public class PalindromeCheck
{
public static void main(String[] args) 
{
String str="malayalam";
if(Palindrome(str)) 
{
System.out.println(str+" is a palindrome");
}
else 
{
System.out.println(str+" is not a palindrome");
}
}
public static boolean Palindrome(String s) 
{
String reverse="";
for(int i=s.length()-1;i>=0;i--) 
{
reverse = reverse+s.charAt(i);
}
if(s.equalsIgnoreCase(reverse))
{
return true;
}
else
{
return false;
}
}

}