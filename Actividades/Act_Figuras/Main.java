package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cuadrado cuadradin = new Cuadrado();
        cuadradin.ColorF();
        System.out.println("Introduce el tamaño del lado : ");
        cuadradin.CaAr();


        Triangulo triangulin = new Triangulo();
        triangulin.ColorF();
        System.out.println("Introduce el tamaño del lado : ");
        triangulin.CaAr();

    }
}
