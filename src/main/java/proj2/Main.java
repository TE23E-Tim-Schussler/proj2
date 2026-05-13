package proj2;

import kong.unirest.Unirest;

//*
// Detta är huvuddelen för projektet
// Tim TE23E */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Testkod
    // Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
    //   System.out.println(Testing.checkAvailibility());

    }
    public void getBook(){
        Unirest.get("http://10.151.168.5:3146/books/");

    }
}