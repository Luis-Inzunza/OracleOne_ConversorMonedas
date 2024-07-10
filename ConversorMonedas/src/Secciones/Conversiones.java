package Secciones;

import java.util.Scanner;

public class Conversiones {
    private String monedasUrl = "";
    private String monedaAConsultar ="";
    private String monedaAConvertir ="";

    private String montoUrl = "";
    private double monto = 0;

    public void Elegir (int opcion){

        switch (opcion){
            default -> System.out.println("Elige una de las opciones propuestas");
            case 1 -> { monedasUrl = "/USD/MXN/"; monedaAConsultar= "Pesos Mexicanos"; monedaAConvertir= "Dolares Estaunidenses"; }
            case 2 -> { monedasUrl = "/MXN/USD/"; monedaAConsultar= "Dolares Estaunidenses"; monedaAConvertir= "Pesos Mexicanos"; }
            case 3 -> { monedasUrl = "/USD/AUD/"; monedaAConsultar= "Dolares Australianos"; monedaAConvertir= "Dolares Estaunidenses"; }
            case 4 -> { monedasUrl = "/AUD/USD/"; monedaAConsultar= "Dolares Estaunidenses"; monedaAConvertir= "Dolares Australianos"; }
            case 5 -> { monedasUrl = "/USD/CAD/"; monedaAConsultar= "Dolares Estaunidenses"; monedaAConvertir= "Dolares Canadienses"; }
            case 6 -> { monedasUrl = "/CAD/USD/"; monedaAConsultar= "Dolares Canadienses"; monedaAConvertir= "Dolares Estaunidenses"; }
            case 7 -> { monedasUrl = "Salir"; }
        }
    }

    public void Monto(){
        System.out.println("Cuanto es el monto que deseas consultar?");
        Scanner lectura = new Scanner(System.in);
        var busqueda = lectura.nextLine();
        montoUrl=busqueda;
        monto = Double.parseDouble(busqueda);
        System.out.println("*****");
        System.out.println("moneda a convertir " + monedaAConvertir + " y  moneda a consultar " + monedaAConsultar + " en un monto de " + busqueda);
    }

    public String getMonedasUrl() {
        return monedasUrl;
    }

    public String getMontoUrl() {
        return montoUrl;
    }
}
