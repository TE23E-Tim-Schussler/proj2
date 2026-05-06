package proj2;
//*
// Detta är huvuddelen för projektet
// Tim TE23E */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
        System.out.println(Testing.checkAvailibility());
    }
}