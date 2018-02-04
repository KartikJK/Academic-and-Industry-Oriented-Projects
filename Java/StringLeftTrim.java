public class StringLeftTrim
{
    static int i,c=0,res,j;
    
    static void stringltrim(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            break;
        }
        for(j=i;j<s.length();j++)
        System.out.print(s.charAt(j));
    }
    
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("   manchester united is also known as red devil ");
        
        StringLeftTrim.stringltrim("   manchester united is also known as red devil ");
    }
}
