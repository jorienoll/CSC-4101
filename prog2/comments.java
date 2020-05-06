import java.util.Scanner;
/*
 * @author Jorie Noll
 * Programming Languages
 * Homework 2- C-based comments
*/

public class Comments {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("\n Input a potential C-based programming language comment: ");
        String input = s.nextLine();
        System.out.print("\n");

        char firstSlash = input.charAt(0);
        String frontSlash = String.valueOf(firstSlash);

        char firstAstr = input.charAt(1);
        String frontAstr = String.valueOf(firstAstr);

        char secondAstr = input.charAt(input.length()-2);
        String endAstr = String.valueOf(secondAstr);

        char secondSlash = input.charAt(input.length()-1);
        String finalSlash = String.valueOf(secondSlash);


        if(frontSlash.equals("/") && frontAstr.equals("*") && endAstr.equals("*") && finalSlash.equals("/")){
            System.out.println("'" + input + "'" + " is a successful comment. \n");
        }
        else{
            System.out.println("'" + input + "'" + " is not a successful comment. \n");
        }
    }
}
