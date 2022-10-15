
package LabFinal;

import java.util.Scanner;

public class Q1_Automata {
     static boolean a(String s){
        int state=0;
        boolean accept= false;
        
        System.out.print("->"+state);
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'){
                   state=1;}
                   else
                   state=0;
                }
            else if(state==1){
                if(c=='0'|c=='1'){
                   state=1;}
                   else
                   state=0;
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
    
    static boolean b(String s){
        int state=0;
        boolean accept= false;
        System.out.print("->"+state);
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'){
                   state=1;}
                   else
                   state=0;
                }
            else if(state==1){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'){
                   state=1;}
                   else
                   state=0;
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
    static boolean c(String s){
        int state=0;
        boolean accept= false;
        System.out.println("->"+state);
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'|c=='A'|c=='B'|c=='C'|c=='D'|c=='E'|c=='F'){
                   state=1;}
                   else
                   state=0;
                }
            else if(state==1){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'|c=='A'|c=='B'|c=='C'|c=='D'|c=='E'|c=='F'){
                   state=1;}
                   else
                   state=0;
                }
            
        System.out.print("->"+state);
        
            }
        
    if(state==1){
        accept=true;
    }else{
        accept= false;
    }
        return accept;
    }static boolean d(String s){
        int state=0;
        boolean accept= false;
        System.out.print("->"+state);
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'){
                   state=1;}
                   else
                   state=0;
                }
            else if(state==1){
                if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'){
                   state=1;}
                   else
                   state=0;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String from [01]: ");
        String s=sc.nextLine();
        
        System.out.println(s+" is Binary? >"+a(s));
        System.out.println(s+" is Decimal? >"+b(s));
        System.out.println(s+" is Hexadecimal? >"+c(s));
        System.out.println(s+" is Octal? >"+d(s));
    }
}
