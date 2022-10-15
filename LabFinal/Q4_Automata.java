
package LabFinal;

import java.util.Scanner;
import static LabFinal.Q3_Automata.g;

public class Q4_Automata {
   
  
     static boolean g(String s){
        int state=0;
        boolean accept= false;
        
        System.out.print("->"+state);
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if((int)c>=65 && (int)c<=90 || (int)c>=97 && (int)c<=122){
                   state=0;}
                else
                    state =1;
                }
            else if(state==1){
                if((int)c>=65 && (int)c<=90 || (int)c>=97 && (int)c<=122){
                   state=1;}
                }
            
        System.out.print("->"+state);
        
            }
        
    if(state==0){
        accept=true;
    }else{
        accept= false;
    }
        return accept;
    }
     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String from [01 a-z]: ");
        String s=sc.nextLine();
        
        System.out.println(s+" is a Java Variable? >"+g(s));
    }
}
