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
        System.out.println("""
          Library!
          1. Visitor mode
          2. Librarian mode
          3. Admin mode 
          4. Exit     
        """);       
            String mode = cnsl.readLine();
            if (mode == "4") {
                System.out.println("EXITTING!!!!!!!!");
            }


        // Testkod
    // Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
    //   System.out.println(Testing.checkAvailibility());


    }
    public void getBook(){
        Unirest.get("http://10.151.168.5:3146/books/");

    }
}