package proj2;
import kong.unirest.Unirest;

import java.io.Console;
import java.util.*;
import java.util.Scanner;


//*
// Detta är huvuddelen för projektet
// Tim TE23E */
public class Main {
    
    public static void main(String[] args) {
        int input;
            System.out.println("""
                    Library!
                    1.Borrow book
                    2.Sign up
                    3.Log in
                    4.Exit
                    """);
                    while(true){
            while(true){
                try{
                input = Integer.parseInt(getInput());
                break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    continue;
                }       
            }
            if (input == 4){
                break;
            } if (input == 1) {
                System.out.println("Enter book ID:");
            }
        }


        // Testkod
    // Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
    //   System.out.println(Testing.checkAvailibility());


    }
    public static String getInput(){
        
            String input;
                Scanner scanner = new Scanner(System.in);
        
             input = scanner.nextLine();
             return input;

    }

}