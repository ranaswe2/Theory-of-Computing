
package LabFinal;

import java.util.Scanner;
import static LabFinal.Q2_Automata.e;

public class Q3_Automata {
    
    
     static boolean g(String s){
        int state=0;
        boolean accept= false;
        
        System.out.print("->"+state);
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(state==0){
                if(c=='.'){
                   state=1;}
                else
                    state =0;
                }
            else if(state==1){
                if(c=='p'){
                   state=2;}
                
                else
                    state =0;
                }
            else if(state==2){
                if(c=='d'){
                   state=3;}
                else
                    state =0;
                }
            
            else if(state==3){
                if(c=='f'){
                   state=4;}
                
                else
                    state =0;
                }
            else if(state==4){
                if(c=='\0'){
                   state=4;}
                else
                    state =0;
                }
            
        System.out.print("->"+state);
        
            }
        
    if(state==4){
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
        
        System.out.println(s+" is a PDF File? >"+g(s));
    }
}
