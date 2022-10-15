
package Autamata;

import java.util.Scanner;


public class PalindromeByRegex {
    
    public static boolean matcher(String regex,String byt){
        
    boolean bool= byt.matches(regex);
        return bool;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter String for  Alphabet {0,1} : ");
        String byt= sc.nextLine();//
        
        System.out.println(byt+" is a Palindrome Number :"+matcher("1A*1".replace("A", "(1A1|0A0|0|1)")+"|0A*0".replace("A", "(1A1|0A0|0|1)"),byt));
        
    }
}
