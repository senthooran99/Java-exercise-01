import java.util.regex.*;
import java.util.Scanner;
public class Regularexp {
    public static void main(String[] args){
        while (true) {
            //Read Regex from user
            Scanner read= new Scanner(System.in);
            System.out.println("Enter Regex pattern:");
            String pattern=read.nextLine();
            //Create the patter
            Pattern p = Pattern.compile(pattern);
            //Read the input string to check
            System.out.print("Enter a string: ");
            String text= read.nextLine();
            //Create a matcher
            Matcher matcher = p.matcher(text);
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+ matcher.start()+" and ending at index "+matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("Not found the match ");
			 System.out.println("Try with another pattern ");
            }
        }
    }
}