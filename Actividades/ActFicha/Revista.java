package com.company;

public class Revista extends Fitxa{

    public short any,nro;

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    public Revista(String referencia, String titulo, short any, short nro) {
        super(referencia, titulo);
        this.any = any;
        this.nro = nro;
    }
}
