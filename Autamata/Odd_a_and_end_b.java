
package Autamata;

import java.util.Scanner;

public class Odd_a_and_end_b {
    public static boolean match(String s){
        boolean accept= false;
        String st="1a";
        
            System.out.print("->"+st);
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(st=="1a"){
                if(c=='a')
                    st="2a";
               else if(c=='b')
                    st="1b";
            }
            else if(st=="2a"){
                if(c=='a')
                    st="1a";
               else if(c=='b')
                    st="2b";
            }
            else if(st=="1b"){
                if(c=='a')
                    st="2a";
               else if(c=='b')
                    st="1b";
            }
            else if(st=="2b"){
                if(c=='a')
                    st="1a";
               else if(c=='b')
                    st="2b";
            }
            System.out.print("->"+st);
        }
        
        if(st.equals("2b")){
            accept=true;}
        else
            accept=false;
        
        return accept;
    }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter String:");
        String str=s.nextLine();
        
        System.out.println("\nAccepted: "+match(str));
    }
}
