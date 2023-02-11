package com.palomino.metodos;

public class Clase03 {
    public static void celular(String marca, int precio, String modelo, int megapixeles, int bateria){
        System.out.println(
                "El celular tiene las siguientes caracteristicass:"+ "\nLa marca es: " + marca
                + "\nEl precio es: " + precio + " "+ "pesos" + "\nEl modelo es: " + modelo + "\nLos Megapixeles de la camara son: " +
                 megapixeles + "\nLa bateria es de: " + bateria + "miliamperios"
        );

        }
     public static void registrar(){
        celular("Xiaomi", 12000, "SDT2736", 60, 5000);
     }
}
