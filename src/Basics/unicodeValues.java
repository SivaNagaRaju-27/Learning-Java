package Basics;


public class unicodeValues {
    public static void main(String args[])
        throws java.io.IOException{
        int n;
        System.out.print("Enter a Character: ");
        n = System.in.read();
        System.out.println("Unicode_Val("+(char)n+") is: "+n);
    }    
}
