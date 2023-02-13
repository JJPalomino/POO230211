package com.palomino.metodos;

public class Clase03 {
    public static void celular(String marca, int precio, String modelo, int megapixeles, int bateria){
        System.out.println(
                "El celular tiene las siguientes caracteristicass:"+ "\nLa marca es: " + marca
                        + "\nEl precio es: " + "$" +precio + "\nEl modelo es: " + modelo + "\nLos Megapixeles de la camara son: " +
                        megapixeles + "Mpx" + "\nLa bateria es de: " + bateria + " " + "mA"
        );

    }
    public static void registrar(){
        celular("Xiaomi", 12000, "SDT2736", 60, 5000);
    }
}
