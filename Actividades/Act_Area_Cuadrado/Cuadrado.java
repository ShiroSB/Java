package com.company;

public class Cuadrado {

    public int costados;

    public int getCostados() {
        return this.costados;
    }
    public void setCostados(int costados) {
            this.costados = costados;
    }

    public void CalcArea(){
        System.out.println("El area del cuadrado es: " + this.getCostados() * this.getCostados());
    }

}
