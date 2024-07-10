package Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import Secciones.Menu;

public class Main {
    public static void main(String[] args) {
        Menu inicio = new Menu();
        while(true){
            int respuesta = inicio.Bienvenida();
            System.out.println(respuesta);
            String direccion = "https://v6.exchangerate-api.com/v6/e9dc1ede6703f48c3a59acf3/latest/USD";
            try {


                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

            /*
            Gson gson = new GsonBuilder().setFieldNamingPolicy(.UPPER_CAMEL_CASE).create();
            TituloOMdb miTituloOmdb = gson.fromJson(json, TituloOMdb.class);
            System.out.println("Titulo: " + miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println(miTitulo);

            FileWriter escritura = new FileWriter("peliculas.txt");
            escritura.write(miTitulo.toString());
            escritura.close();

             */

            }catch (Exception e){
                System.out.println("Ocurrio un error");
                System.out.println(e.getMessage());

            }
        }
    }

}
