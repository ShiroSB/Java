package com.company;
import java.util.Scanner;
public class Main {

    public static final String MSG1 = "Introduce el nombre: ";
    public static final String MSG2 = "Introduce el modelo: ";
    public static final String MSG3 = "Introduce el precio: ";
    public static final String MSG4 = "Introduce el material: ";
    public static final String MSG5 = "Introduce la raza: ";
    public static final String MSG6 = "Introduce el color: ";
    public static final String MSG7 = "Introduce la edad: ";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        Coche datos = new Coche();
        System.out.println(MSG1);
        datos.setNombre(sc.next());
        System.out.println(MSG2);
        datos.setModelo(sc.next());
        System.out.println(MSG3);
        datos.setPrecio(sc.nextFloat());
        System.out.println(datos.getFullData());*/

//      Pedir datos silla 1
        Silla datos = new Silla(null,null,0);
        System.out.println(MSG1);
        datos.setNombre(sc.next());
        System.out.println(MSG4);
        datos.setMaterial(sc.next());
        System.out.println(MSG3);
        datos.setPrecio(sc.nextFloat());

//      Pedir datos silla 2
        Silla datos2 = new Silla(null,null,0);
        System.out.println(MSG1);
        datos2.setNombre(sc.next());
        System.out.println(MSG4);
        datos2.setMaterial(sc.next());
        System.out.println(MSG3);
        datos2.setPrecio(sc.nextFloat());

//      Pedir datos Perro 1
        Perros perro1 = new Perros(null,null,0);
        System.out.println(MSG5);
        perro1.setRaza(sc.next());
        System.out.println(MSG6);
        perro1.setColor(sc.next());
        System.out.println(MSG7);
        perro1.setEdad(sc.nextInt());

//      Concatenamos los datos y los mostramos por pantalla
        System.out.println(datos.getNombre() + " " + datos.getMaterial() + " " + datos.getPrecio());
        System.out.println(datos2.getNombre() + " " + datos2.getMaterial() + " " + datos2.getPrecio());
        System.out.println(perro1.getRaza() + " " + perro1.getColor() + " " + perro1.getEdad());
    }

}
