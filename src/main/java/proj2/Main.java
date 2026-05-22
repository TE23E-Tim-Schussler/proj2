package proj2;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import com.google.gson.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.*;

//*
// Detta är huvuddelen för projektet
// Tim TE23E */
public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        int input;
        while(true){
            //Här är huvudmenyn för biblioteket
            System.out.println("""
                    [Bibliotek!!!]
                    /////////////////////
                    1.Hämta böcker
                    2.Hämta tidningar
                    3.Skriv ut hämtade böcker och tidningar
                    4.Lägg till bok
                    5.Lägg till tidning
                    6.Avsluta
                    /////////////////////
                    """);
                    
            while(true){
                try{
                input = Integer.parseInt(getInput());
                break;
                } catch (Exception e) {
                    // Bara ett felmeddelande
                    System.out.println("Please enter a valid number!");
                    continue;
                }       
            }
            if (input == 1) {
                System.out.println("Hold on...");
                
                    //Här läser vi in JSON filen som hittas vid länken
                    JsonNode response = Unirest.get("http://10.151.168.5:3146/books/")
                    .asJson()
                    .getBody();
                    JSONArray array = response.getArray();
                    ArrayList<Book> books = new ArrayList<>();

                    // För varje objekt man kan hitta i länken så läggs ett till bojekt in i arraylistan
                    for (int i = 0; i < array.length(); i++){
                        JSONObject obj = array.getJSONObject(i);
                        Book book = new Book(
                            obj.getString("id"),
                            obj.getString("title"),
                            obj.getString("author"),
                            obj.getString("genre"),
                            obj.getInt("pages"),
                            obj.getBoolean("isAvailable")
                        );
                        books.add(book);

                        try (Writer writer = new FileWriter("books.json")) {
                        gson.toJson(books, writer); 
                        } catch (IOException e) {
                        System.out.println(e.getMessage());
                        }

                    }
                       for (Book book : books) {
                        System.out.println(book.title);
                    }
        }

                                        

                    
                 if (input == 2){
                    System.out.println("Hold on...");
                
                    //Här läser vi in JSON filen som hittas vid länken
                    JsonNode response = Unirest.get("http://10.151.168.5:3146/magazines/")
                    .asJson()
                    .getBody();

                    JSONArray array = response.getArray();
                    ArrayList<Magazine> magazines = new ArrayList<>();
                    // För varje objekt man kan hitta i länken så läggs ett till bojekt in i arraylistan
                    for (int i = 0; i < array.length(); i++){
                        JSONObject obj = array.getJSONObject(i);
                        Magazine magazine = new Magazine(
                            obj.getString("id"),
                            obj.getString("title"),
                            obj.getInt("issueNumber"),
                            obj.getString("category"),
                            obj.getInt("publishedYear"),
                            obj.getBoolean("isAvailable")
                        );
                        magazines.add(magazine);

                        try (Writer writer = new FileWriter("magazines.json")) {
                        gson.toJson(magazines, writer); 
                        } catch (IOException e) {
                        System.out.println(e.getMessage());
                        }

                    }
                    for (Magazine magazine : magazines) {
                        System.out.println(magazine.title+" issue: "+magazine.issueNumber);
                }   
            } if (input == 3){
                
                try (Reader reader = new FileReader("books.json")) {
             JsonArray jsonArray = JsonParser.parseReader(reader).getAsJsonArray();
                for (JsonElement element : jsonArray) {
                    System.out.println(element);
                }
            } catch (IOException e){
                System.out.println("Ett fel uppstod!");
            }
            try (Reader reader = new FileReader("magazines.json")) {
             JsonArray jsonArray = JsonParser.parseReader(reader).getAsJsonArray();
                for (JsonElement element : jsonArray) {
                    System.out.println(element);
                }
            } catch (IOException e){
                System.out.println("Ett fel uppstod!");
            }

            } if (input == 4){
                System.out.println("Enter id:");
                String Pid = getInput();
                System.out.println("Enter title:");
                String Ptitle = getInput();
                System.out.println("Enter author:");
                String Pauthor = getInput();
                System.out.println("Enter genre:");
                String Pgenre = getInput();
                System.out.println("Enter pages:");
                int Ppages = 0;
                try{
                Ppages = Integer.parseInt(getInput());
                if (Ppages < 1){
                    System.out.println("Must enter a valid number!");
                }
                } catch (Exception e){
                    System.out.println("Must enter a valid number!");
                }
                JsonNode response = Unirest.get("http://10.151.168.5:3146/books/")
                .asJson()
                .getBody();
                Book newBook = new Book(Pid,Ptitle,Pauthor,Pgenre,Ppages,true);
                HttpResponse<String> postResponse;
                String jsonBody = gson.toJson(newBook);
                try{
                    postResponse = Unirest.post("http://10.151.168.5:3146/books/")
                    .header("Content-Type","application/json")
                    .body(jsonBody)
                    .asString();
                
                } catch (Exception e){
                    System.out.println("Ett fel uppstod!");
                }
            } if (input == 5){
                                System.out.println("Enter id:");
                String Pid = getInput();
                System.out.println("Enter title:");
                String Ptitle = getInput();
                System.out.println("Enter issue number:");
                int Pissue = 0;
                Pissue = Integer.parseInt(getInput());
                try{
                if (Pissue < 1){
                    System.out.println("Must enter a valid number!");
                }
                } catch (Exception e){
                    System.out.println("Must enter a valid number!");
                }
                System.out.println("Enter category:");
                String Pcategory = getInput();
                System.out.println("Enter published year:");
                int PpublishedYear = 0;
                try{
                    PpublishedYear = Integer.parseInt(getInput());
                if (PpublishedYear < 1){
                    System.out.println("Must enter a valid number!");
                }
                } catch (Exception e){
                    System.out.println("Must enter a valid number!");
                }
                JsonNode response = Unirest.get("http://10.151.168.5:3146/magazines/")
                .asJson()
                .getBody();
                Magazine newMagazine = new Magazine(Pid,Ptitle,Pissue,Pcategory,PpublishedYear,true);
                HttpResponse<String> postResponse;
                String jsonBody = gson.toJson(newMagazine);
                try{
                    postResponse = Unirest.post("http://10.151.168.5:3146/magazines/")
                    .header("Content-Type","application/json")
                    .body(jsonBody)
                    .asString();
                
                } catch (Exception e){
                    System.out.println("Ett fel uppstod!");
                }
            } if (input== 6){
                break;
            }

            }
        }
    



    // Testkod
    // Book Testing = new Book("123","Epic","Epicman","Epicgenre",123,true);
    // System.out.println(Testing.checkAvailibility());

    public static String getInput() {

        String input;
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();
        return input;

    }

}
