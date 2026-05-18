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
            Console cnsl = System.console();
            while(true){
        System.out.println("""
          Library!
          1. Visitor mode
          2. Librarian mode
          3. Admin mode 
          4. Exit     
        """);       
            String input = cnsl.readLine();
            int mode = Integer.parseInt(input);
            if (mode == 1) {
                System.out.println("""
                    1. Borrow book
                    2. Sign up
                    3. Exit
                """);
            } if (mode == 2){

            } if (mode == 3){

            } else {
                System.out.println("Error try again!");
                System.out.println(mode);
            }
        }


        // Testkod
    // Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
    //   System.out.println(Testing.checkAvailibility());


    }
    public void getBook(){
        Unirest.get("http://10.151.168.5:3146/books/");

    }
}