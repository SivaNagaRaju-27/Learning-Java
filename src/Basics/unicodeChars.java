package Basics;

import java.util.Scanner;
public class unicodeChars {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int i,n;
            System.out.print("Enter the Upper Limit: ");
            n = sc.nextInt();
            for(i=0; i<n; i++){
                System.out.println("Unicode_Char("+i+") is: "+(char)i);
            }
        }
    }
}
