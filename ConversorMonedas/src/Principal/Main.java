package Principal;

import Secciones.Consulta;
import com.google.gson.*;

import java.io.InputStream;
import java.io.InputStreamReader;

import Secciones.Menu;

public class Main {
    public static void main(String[] args) {
        Menu programa = new Menu();
        Consulta consultar = new Consulta();
        while(true){
            int respuesta = programa.Bienvenida();
            consultar.Coneccion();

        }
    }

}
