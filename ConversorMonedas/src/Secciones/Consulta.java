package Secciones;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Consulta {
    private String link = "https://v6.exchangerate-api.com/v6/e9dc1ede6703f48c3a59acf3/pair";

    public void Coneccion(String monedasAConsultar,String monto){
        try{
            URL url = new URL(link + monedasAConsultar + monto);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = String.valueOf(jsonobj.get("conversion_result").getAsString());

            System.out.println(req_result);
            System.out.println("*****");
        }catch (MalformedURLException e) {
            System.out.println("La conexion no fue realizada");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("La conexion no fue realizada");
            System.out.println(e.getMessage());
        }
    }
}
