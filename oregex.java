
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class oregex {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("> ");

        String reg= sc.next();
        String file= sc.next();
        
        String r= reg.replaceAll("\"", "");
        String regex= "("+r+")[a-zA-Z]*";
        
        File f= new File(file);
        
            Scanner collect=new Scanner(f);
           
            while(collect.hasNext()){
                String fstr= collect.next();
                
                Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(fstr);
        int count[]= new int[20000];
        int i=0;
        while (matcher.find()) {
            // Get the group matched using group() method
            System.out.println(matcher.group(0));
            i++;
        }
            }
    
    }
}