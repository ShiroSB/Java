package com.company;

public class Obra extends Fitxa{

    public String autor;
    public short nrePags;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNrePags() {
        return nrePags;
    }

    public void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }

    public Obra(String referencia, String titulo, String autor, short nrePags) {
        super(referencia, titulo);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    @Override
    public void vista(){
        System.out.println("A");
    }

}
