
/****
*   Name  : Roichuddin Rana
*   Roll No: ASH1925003M
*   Email   : rana2514@student.nstu.edu.bd
*   Date     : 10 Sept 2021
****/
package Autamata;

import java.util.Scanner;

public class CP3_Autamata {
    
    
    private static boolean a(String s) {
    int state=0;
		boolean accepted = false;
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c=='1')
                    state=1;
                 else
                     state=5;
                 }
                else if(state==1){
                  if(c=='1')
                    state=1;
                 else if(c=='0')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c=='0')
                    state=2;
                 
                 else if(c=='1')
                    state=1;
                 }
                 
            }   
                if(state==2){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean b(String s) {
    int state=0;
		boolean accepted = false;
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c =='1')
                    state=1;
                 else
                    state=0;
                 }
                else if(state==1){
                  if(c =='1')
                    state=2;
                 else
                    state=1;
                 }
                 
                else if(state==2){
                  if(c =='1')
                    state=3;
                 else 
                    state=2;
                 }
                 
            }   
                if(state==3){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    
    private static boolean c(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c =='0' )
                    state=1;
                 else if(c =='1' )
                     state=0;
                 }
                else if(state==1){
                 if(c =='1')
                    state=2;
                 else if(c =='0' )
                     state=1;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=3;
                  else if(c =='1' )
                     state=0;
                 }
                 else if(state==3){
                  if(c =='1')
                    state=4;
                  else if(c =='0' )
                     state=1;
                 }
                 else if(state==4){
                  if(c =='1' || c =='0')
                    state=4;
                 }
            }   
                if(state==4){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean d(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c =='0' || c =='1')
                    state=1;
                 }
                else if(state==1){
                 if(c =='0' || c =='1')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=4;
                 }
                 if(state==3){
                 if(c =='0' || c =='1')
                    state=3;
                 }
                 
            }   
                if(state==3){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean e(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c =='0' )
                    state=1;
                 else if(c =='1' )
                     state=3;
                 }
                else if(state==1){
                 if(c =='1'||c =='0')
                    state=2;
                 }
                 
                else if(state==2){
                 if(c =='1'||c =='0')
                    state=1;
                 }
                 else if(state==3){
                 if(c =='1'||c =='0')
                    state=4;
                 }
                 else if(state==4){
                  if(c =='1' || c =='0')
                    state=3;
                 }
            }   
                if(state==1||state==4){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean f(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=0;
                  else if(c =='1')
                    state=1;
                 }
                else if(state==1){
                  if(c =='0')
                    state=0;
                  else if(c =='1')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=2;
                 }
                 if(state==3){
                 if(c =='0' || c =='1')
                    state=3;
                 }
                 
            }   
                if(state!=3){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean g(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                 if(c =='1'||c =='0')
                    state=1;
                 }
                else if(state==1){
                 if(c =='1'||c =='0')
                    state=2;
                 }
                 
                else if(state==2){
                 if(c =='1'||c =='0')
                    state=3;
                 }
                 else if(state==3){
                 if(c =='1'||c =='0')
                    state=4;
                 }
                 else if(state==4){
                  if(c =='1' || c =='0')
                    state=5;
                 }
                 
                 else if(state==5){
                  if(c =='1' || c =='0')
                    state=6;
                 }
                 else if(state==6){
                  if(c =='1' || c =='0')
                    state=6;
                 }
            }   
                if(state!=6){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean h(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=4;
                  else if(c =='1')
                    state=1;
                 }
                else if(state==1){
                  if(c =='0')
                    state=4;
                  else if(c =='1')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=4;
                  else if(c =='1')
                    state=3;
                 }
                 if(state==3){
                 if(c =='0' || c =='1')
                    state=4;
                 }
                 if(state==4){
                 if(c =='0' || c =='1')
                    state=4;
                 }
                 
            }   
                if(state!=2||state!=3){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean i(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=1;
                 }
                else if(state==1){
                  if(c =='0')
                    state=2;
                  else if(c =='1')
                    state=3;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=1;
                 }
                 if(state==3){
                 if(c =='0' || c =='1')
                    state=3;
                 }
                 
            }   
                if(state==1||state==2){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean j(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=2;
                 }
                else if(state==1){
                  if(c =='0')
                    state=5;
                  else if(c =='1')
                    state=3;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=4;
                 }
                else if(state==3){
                  if(c =='0')
                    state=6;
                  else if(c =='1')
                    state=4;
                 }
                else if(state==4){
                  if(c =='0')
                    state=4;
                  else if(c =='1')
                    state=4;
                 }
                else if(state==5){
                  if(c =='0')
                    state=5;
                  else if(c =='1')
                    state=6;
                 }
                else if(state==6){
                  if(c =='0')
                    state=6;
                  else if(c =='1')
                    state=4;
                 }
                 
            }   
                if(state==5 || state==6){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean k(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=2;
                 }
                else if(state==1){
                  if(c =='0')
                    state=2;
                  else if(c =='1')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=2;
                  else if(c =='1')
                    state=2;
                 }
                 
            }   
                if(state==0 || state==1){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean l(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=4;
                  else if(c =='1')
                    state=1;
                 }
                else if(state==1){
                  if(c =='0')
                    state=5;
                  else if(c =='1')
                    state=2;
                 }
                 
                else if(state==2){
                  if(c =='0')
                    state=6;
                  else if(c =='1')
                    state=3;
                 }
                else if(state==3){
                  if(c =='0')
                    state=7;
                  else if(c =='1')
                    state=3;
                 }
                else if(state==4){
                  if(c =='0')
                    state=0;
                  else if(c =='1')
                    state=5;
                 }
                else if(state==5){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=6;
                 }
                else if(state==6){
                  if(c =='0')
                    state=2;
                  else if(c =='1')
                    state=7;
                 }
                else if(state==7){
                  if(c =='0')
                    state=3;
                  else if(c =='1')
                    state=7;
                 }
                 
            }   
                if(state!=7 || state!=4 ||state!=5 || state!=6){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean m(String s) {
    int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=1;
                 }
                 else if(state==1){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=1;
                 }
                 
            }   
                if(state==0){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    private static boolean n(String s) {
                int state=0;
		boolean accepted = false; 
             for(int j=0;j<s.length();j++){
		char c= s.charAt(j);
                 if(state==0){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=1;
                 }
                 else if(state==1){
                  if(c =='0')
                    state=1;
                  else if(c =='1')
                    state=1;
                 }
                 
            }   
                if(state==1){
                accepted = true;}
                else{
                    accepted = false;}
		
		return accepted;
	}
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter String for  Alphabet {0,1} : ");
        String byt= sc.nextLine();
        
        System.out.println(byt+" accepted by :");
        
        System.out.println("a. {w| w begins with a 1 and ends with a 0} => "+a(byt));
        System.out.println("b. {w| w contains at least three 1s} => "+b(byt));
        System.out.println("c. {w| w contains the substring 0101 (i.e., w = x0101y for some x and y)} => "+c(byt));
        System.out.println("d. {w| w has length at least 3 and its third symbol is a 0} => "+d(byt));
        System.out.println("e. {w| w starts with 0 and has odd length, or starts with 1 and has even length} => "+e(byt));
        System.out.println("f. {w| w doesn’t contain the substring 110} => "+f(byt));
        System.out.println("g. {w| the length of w is at most 5} => "+g(byt));
        System.out.println("h. {w| w is any string except 11 and 111} => "+h(byt));
        System.out.println("i. {w| every odd position of w is a 1} => "+i(byt)); 
        System.out.println("j. {w| w contains at least two 0s and at most one 1} => "+ j(byt)); 
        System.out.println("k. {ε, 0} => "+k(byt)); 
        System.out.println("l. {w| w contains an even number of 0s, or contains exactly two 1s} => "+l(byt)); 
        System.out.println("m. The empty set => "+m(byt)); 
        System.out.println("n. All strings except the empty string => "+n(byt)); 
         
    }
    }

/****
*   
*   cp3@rana2514@student.nstu.edu.bd#2021
*   
****/