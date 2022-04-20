package com.company;
import java.util.Scanner;

public class Fitxa{

    public String referencia,titulo;

    Scanner sc = new Scanner(System.in);

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fitxa(String referencia, String titulo) {
        this.referencia = referencia;
        this.titulo = titulo;
    }

    public abstract void vista();

}
