package proj2;
    import com.google.gson.*;
    import com.google.gson.reflect.TypeToken;
    import java.lang.reflect.Type;
    import kong.unirest.Unirest;
    import kong.unirest.HttpResponse;
    import kong.unirest.UnirestException;
    import java.nio.file.*;
    import java.io.IOException;
    import java.util.ArrayList;
    //*Här importeras vissa bibliotek som kan behövas i projektet,
    // detta görs här eftersom det är ursprungsklassen och därför behöver inga bibliotek hämtas
    // senare i andra klassar */
public class Template {
    //*
    // Denna klass fungerar som ursprung för alla andra med endast nödvändiga
    // egenskaper (id:et och ifall den är tillgänglig) 
    // */
    public String id = "";
    public boolean isAvailible = true;

    public Template(String id, boolean isAvailible){
        this.id = id;
        this.isAvailible = isAvailible;

    }
    public boolean checkAvailibility(){
        return isAvailible;
    }

}
