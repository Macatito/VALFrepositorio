import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.io.IOException;
import java.net.URI;
import com.google.gson.*;

public class Arreglador {
    public static Product[] obtenerproductos(){
  // Objeto que controla cosas chistosas en internet
  HttpClient client = HttpClient.newHttpClient();
  // Pide algo chistoso de internet
  HttpRequest request = HttpRequest.newBuilder()
  .uri(URI.create("https://api.escuelajs.co/api/v1/products"))
  .GET()
  .build();
  // El chiste que encuentra el cliente
  HttpResponse<String> chiste = null;
  // Descargamos el chiste.body
    try {
        chiste = client.send(request, HttpResponse.BodyHandlers.ofString());
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 

    Gson gson = new GsonBuilder()
         .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())  // Registrar el adaptador
         .create();

    Product[] atunes = gson.fromJson(chiste.body(), Product[].class);
    return atunes;
    }}