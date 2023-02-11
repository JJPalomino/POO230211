package com.palomino.metodos;

public class Clase03 {
    public static void celular(String marca, int precio, String modelo, int megapixeles, int bateria){
        System.out.println(
                "El celular tiene las siguientes caracteristicass:"+ "La marca es: " + marca
                + "El precio es: " + precio + "pesos" + "El modelo es: " + modelo + "Los Megapixeles de la camara son: " +
                 megapixeles + "La bateria es de: " + bateria + "miliamperios"
        );

        }
     public static void registrar(){
        celular("Xiaomi", 12000, "SDT2736", 60, 5000);
     }
}
