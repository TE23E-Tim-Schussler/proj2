package proj2;
//*
// Bookklassen används för att kunna lägga till böcker i biblioteket */
public class Book extends Template {
public String title = "";
public String author = "";
public String genre = "";
public int pages = 0;
public boolean isAvailible = true;
    public Book(String id,String title, String author, String genre,
         int pages, boolean isAvailible){
        super(id,isAvailible);
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
}
}
