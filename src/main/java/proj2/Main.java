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
            while(true){
                try{
                input = Integer.parseInt(getInput());
                break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    continue;
                }       
        }
        System.out.println(input);


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