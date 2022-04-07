package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Coche coches = new Coche();
        coches.SonidoV();
        coches.CerrarPuerta();
        coches.motor();

        Patinete patinetes = new Patinete();
        patinetes.SonidoV();
        patinetes.CerrarPuerta();
        patinetes.motor();
    }
}
