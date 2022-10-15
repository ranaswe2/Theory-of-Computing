
/****
*   Name  : Roichuddin Rana
*   Roll No: ASH1925003M
*   Email   : rana2514@student.nstu.edu.bd
*   Date     : 10 Sept 2021
****/

package Autamata;

import java.util.Scanner;

public class CP2_Autamata {
    
    public static boolean matcher(String regex,String str){
    boolean bool= str.matches(regex);
        return bool;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter String for  Alphabet {a,b} : ");
        String str= sc.nextLine();
        
        System.out.println(str+" accepted by :");
        
        System.out.println("a. {w| w has at least three a’s and at least two b’s} => "+matcher("[a{3,} b{2,}]*",str));//[ab]*a[ab]*b[ab]*a[ab]*b[ab]*a[ab]*
        System.out.println("b. {w| w has exactly two a’s and at least two b’s} => "+matcher("[a{2} b{2,}]*",str));//abb+a|bab+a|b+aab|aabb+|bb +aa
        System.out.println("c. {w| w has an even number of a’s and one or two b’s} => "+matcher("baa(aa)*|aa(aa)*b|baa(aa)*b|aba(aa)*b|aab(aa)*b",str));
        System.out.println("d. {w| w has an even number of a’s and each a is followed by at least one b} => "+matcher("abab(abab)*",str));
        System.out.println("e. {w| w starts with an a and has at most one b} => "+matcher("aba*",str)); 
        System.out.println("f. {w| w has an odd number of a’s and ends with a b} => "+matcher("b*a(aa)*b+",str));
        System.out.println("g. {w| w has even length and an odd number of a’s} => "+matcher("((ba|ab)(ba|ab))*(bb)*(aa)*(ba|ab)(aa)*(bb)*((ba|ab)(ba|ab))*",str));
       
    }
}


/****
*   
*   cp2@rana2514@student.nstu.edu.bd#2021
*   
****/