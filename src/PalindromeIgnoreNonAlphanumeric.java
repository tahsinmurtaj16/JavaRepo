import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a new String:");
        String s = inp.nextLine();

        System.out.println("Ignoring non-alphanumeric characters, \nis"+ s +" a palindrome?"+isPalindrome(s));

    }
    public static boolean isPalindrome(String s)
    {
        String s1 = filters(s);
        String s2 = reverse(s1);

        return s2.equals(s1);
    }
    public static String filters(String s)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static String reverse(String s)
    {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
