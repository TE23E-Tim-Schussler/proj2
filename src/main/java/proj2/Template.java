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
public class Template {
    public String id = "";

    public Template(String id){
        this.id = id;
    }

}
