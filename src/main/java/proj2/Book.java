package proj2;

public class Book extends Template {
public String title = "";
public String author = "";
public String genre = "";
public int pages = 0;
public boolean isAvailible = true;
    public Book(String id,String title, String author, String genre,
         int pages, boolean isAvailible){
        super(id);
        this.id = id;
        this.title = title;
}
}
