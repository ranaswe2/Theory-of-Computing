
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HuntingtonDiseaseDetection {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        System.out.print("< ");
        String file= sc.nextLine();
        File f= new File("C:\\Users\\Acer\\OneDrive\\Documents\\NetBeansProjects\\Theory of Computing\\src\\sequences\\"+file);
        
            Scanner collect=new Scanner(f);
            while(collect.hasNext()){
                String DNA=collect.next();
                System.out.println(DNA);
        String regex = "(CAG)+";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(DNA);
        MatchResult result= matcher.toMatchResult();
       // System.out.println("Current Matcher: " + result);
        int count[]= new int[20000];
        int i=0;
        while (matcher.find()) {
            // Get the group matched using group() method
           // System.out.println(matcher.group(0).replaceAll("CAG", "X").length());
            count[i]= matcher.group(0).replaceAll("CAG", "X").length();
            i++;
        }
        
        int maximum = count[0];   // start with the first value
    for (int j=1; j<count.length; j++) {
        if (count[j] > maximum) {
            maximum = count[j];   // new maximum
        }
    }
                System.out.println("max number of CAG repeats = "+maximum);
    
                if(maximum<=9){
                    System.out.println("not human");
                }
                else if(maximum>9 && maximum<=35){
                    System.out.println("normal");
                }
                else if(maximum>35 && maximum<=39){
                    System.out.println("high risk");
                }
                else if(maximum>39 && maximum<=180){
                    System.out.println("Huntington's disease");
                }
                else if(maximum>=180){
                    System.out.println("not human");
                }
                
           // collect.close();
       
    }
    }
}
