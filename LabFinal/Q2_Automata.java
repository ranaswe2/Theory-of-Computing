
package LabFinal;

import java.util.Scanner;

public class Q2_Automata {
    
     static boolean e(String s){
        int state=0;
        boolean accept= false;
        
        System.out.print("->"+state);
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'){
                   state=1;}
                else
                    state =0;
                }
            else if(state==1){
                if(c=='0'|c=='1'){
                   state=2;}
                
                else
                    state =0;
                }
            else if(state==2){
                if(c=='0'|c=='1'){
                   state=1;}
                else
                    state =0;
                }
            
        System.out.print("->"+state);
        
            }
        
    if(state==1){
        accept=true;
    }else{
        accept= false;
    }
        return accept;
    }
     static boolean f(String s){
        int state=0;
        boolean accept= false;
        
        System.out.print("->"+state);
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'){
                   state=0;}
                else
                state=1;
                }
            else if(state==1){
                if(c=='0'|c=='1'){
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
        System.out.println("Enter a String from [01]: ");
        String s=sc.nextLine();
        
        System.out.println(s+" is Odd Binary? >"+e(s));
        System.out.println(s+" is Number? >"+f(s));
    }
}
