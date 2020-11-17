interface palindrom_inter{
    public void palind();
}



public class palindrome {
    public static void palind (int n){
        int rev_int=0, remainder, originalInt;
        originalInt=n;

        while( n != 0 )
        {
            remainder = n % 10;
            rev_int = rev_int * 10 + remainder;
            n  /= 10;
        }
        if (originalInt == rev_int)
            System.out.println(originalInt + " არის პალინდრომი.");
        else
            System.out.println(originalInt + " არ არის");
    }
}
