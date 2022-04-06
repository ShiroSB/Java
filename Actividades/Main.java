//Calcular el area de un cuadrado

package com.company;
import java.util.Scanner;
public class Main {

    public static final String MSG1 = "Introduce la medida del cuadrado: ";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            Cuadrado valor = new Cuadrado();
            System.out.println(MSG1);
            valor.setCostados(sc.nextInt());
            valor.CalcArea();

    }

}
