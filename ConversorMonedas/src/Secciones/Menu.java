package Secciones;

import java.util.Scanner;

public class Menu {
    public int Bienvenida(){
        System.out.println("Bienvenido al Conversor de monedas Java!");
        System.out.println("Por favor, selecciona una opcion escribiendo el numero");
        System.out.println("1) Dolar Estadounidense => Pesos Mexicanos");
        System.out.println("2) Pesos Mexicanos => Dolar Estadounidense");
        System.out.println("3) Dolar Estadounidense => Dolar Australiano");
        System.out.println("4) Dolar Australiano => Dolar Estadounidense");
        System.out.println("5) Dolar Estadounidense => Dolar Canadiense");
        System.out.println("6) Dolar Canadiense => Dolar Estadounidense");
        System.out.println("7) Salir");
        Scanner lectura = new Scanner(System.in);
        var busqueda = lectura.nextLine();

        return Integer.parseInt(busqueda);
    }

    public void Final(int cambio, String monedaAConsultar, String monedaAConvertir){

    }
}
