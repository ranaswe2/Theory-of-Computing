
/****
*   Name  : Roichuddin Rana
*   Roll No: ASH1925003M
*   Email   : rana2514@student.nstu.edu.bd
*   Date     : 10 Sept 2021
****/

package Autamata;

import java.util.Scanner;

public class CP1_Autamata {
    
    public static boolean matcher(String regex,String byt){
    boolean bool= byt.matches(regex);
        return bool;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter String for  Alphabet {0,1} : ");
        String byt= sc.nextLine();
        
        System.out.println(byt+" accepted by :");
        
        System.out.println("a. {w| w begins with a 1 and ends with a 0} => "+matcher("1[01]*0",byt));
        System.out.println("b. {w| w contains at least three 1s} => "+matcher("[01]*1[01]*1[01]*1[01]*",byt));
        System.out.println("c. {w| w contains the substring 0101 (i.e., w = x0101y for some x and y)} => "+matcher("[01]*0101[01]*",byt));
        System.out.println("d. {w| w has length at least 3 and its third symbol is a 0} => "+matcher("[01][01]0[01]*",byt));
        System.out.println("e. {w| w starts with 0 and has odd length, or starts with 1 and has even length} => "+matcher("0([01][01])*|1[0]([10][10])*",byt));
        System.out.println("f. {w| w doesn’t contain the substring 110} => "+matcher("[^(110)]",byt));
        System.out.println("g. {w| the length of w is at most 5} => "+matcher("[01]{0,5}",byt));
        System.out.println("h. {w| w is any string except 11 and 111} => "+matcher("[^(11)(111)]",byt));
        System.out.println("i. {w| every odd position of w is a 1} => "+matcher("1([01]1)*",byt));
        System.out.println("j. {w| w contains at least two 0s and at most one 1} => "+matcher("0{2,}1?|1?0{2,}|0+1?0+",byt));
        System.out.println("k. {ε, 0} => "+matcher("0?",byt));
        System.out.println("l. {w| w contains an even number of 0s, or contains exactly two 1s} => "+matcher("(00)*1*(00)*|0*10*10*",byt));
        System.out.println("m. The empty set => "+matcher("[01]{0}",byt));
        System.out.println("n. All strings except the empty string => "+matcher("[01]+",byt));
        
    }
}


/****
*   
*   cp1@rana2514@student.nstu.edu.bd#2021
*   
****/