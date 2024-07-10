package Principal;

import Secciones.Consulta;
import Secciones.Conversiones;
import Secciones.Menu;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Menu programa = new Menu();
        Conversiones conversiones = new Conversiones();
        Consulta consultar = new Consulta();

        while(true){
            int moneda = programa.Bienvenida();
            conversiones.Elegir(moneda);
            if (Objects.equals(conversiones.getMonedasUrl(), "Salir")) break;
            conversiones.Monto();
            consultar.Coneccion();

        }
    }
}
