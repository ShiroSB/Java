package com.company;
import java.util.Scanner;

public class Triangulo extends Figuras {

    public static final String MSG1 = "Que color tiene el triangulo? ";

    Scanner sc = new Scanner(System.in);

    public String color;
    public int lado;

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void ColorF() {
        Triangulo color = new Triangulo();
        System.out.println(MSG1);
        setColor(sc.next());

    }

    @Override
    public void CaAr(){
        Triangulo lado = new Triangulo();
        setLado(sc.nextInt());
        System.out.println("Area : " + getLado() * getLado());
        System.out.println("Color : " + getColor());
    }

}
