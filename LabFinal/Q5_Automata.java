
package LabFinal;

import java.util.Scanner;

public class Q5_Automata {
    static boolean macher(String regex,String s){
        boolean b=s.matches(regex);
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String from [01 a-z]: ");
        String s=sc.nextLine();
        String E="E*".replace("E", "(0|1|2|3|4|5|6|7|8|9)*");
        String o="o*".replace("o", "(+|-)*");
        System.out.println(s+" is Accepted? >"+macher(E+o+E,s));
    }
    
}
