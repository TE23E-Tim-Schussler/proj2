package proj2;

public class Magazine extends Template{
public String title = "";
public int issueNumber = 0;
public String category = "";
public int publishedYear = 0;
public boolean isAvailible = true;
    public Magazine(String id, String title, int issueNumber, String category,
         int publishedYear, boolean isAvailible){
        super(id,isAvailible);
        this.id = id;
        this.title = title;
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
}
}
