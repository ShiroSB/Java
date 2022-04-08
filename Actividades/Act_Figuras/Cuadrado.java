package com.company;
import java.util.Scanner;

public class Cuadrado extends Figuras {

    public static final String MSG1 = "Que color tiene el cuadrado?: ";


    Scanner sc = new Scanner(System.in);

    public String color;
    public int ladoC;

    public int getLadoC() {
        return ladoC;
    }
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void ColorF() {
        Cuadrado color = new Cuadrado();
        System.out.println(MSG1);
        setColor(sc.next());
    }

    @Override
    public void CaAr(){
        Cuadrado ladoC = new Cuadrado();
        setLadoC(sc.nextInt());
        System.out.println("Area : " + getLadoC() * getLadoC());
        System.out.println("Color : " + getColor());
    }
}
