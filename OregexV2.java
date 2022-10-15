
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OregexV2 {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc= new Scanner(System.in);
        
        String reg= sc.next();
        String file= sc.next();
        
        String r= reg.replaceAll("\"", "");
        File f= new File("src\\"+file);
        
            Scanner collect=new Scanner(f);
           
            while(collect.hasNext()){
                 String str= collect.next();
                if(str.contains(r)){
                    if((str.substring(0,r.length()).equals(r)))
            System.out.println(str);
                }
            
        }
    }
}
