package com.company;

public class Volum extends Obra{

    public short nro;

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    public Volum(String referencia, String titulo, String autor, short nrePags, short nro) {
        super(referencia, titulo, autor, nrePags);
        this.nro = nro;
    }
}
