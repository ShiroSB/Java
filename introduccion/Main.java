package com.company;
import java.util.Scanner;
public class Main {

    public static final String MSG1 = "Introduce el nombre: ";
    public static final String MSG2 = "Introduce el modelo: ";
    public static final String MSG3 = "Introduce el precio: ";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coche datos = new Coche();
        System.out.println(MSG1);
        datos.setNombre(sc.next());
        System.out.println(MSG2);
        datos.setModelo(sc.next());
        System.out.println(MSG3);
        datos.setPrecio(sc.nextFloat());
        System.out.println(datos.getFullData());
    }
}
