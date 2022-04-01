package com.company;

public class Silla {

    public String nombre,material;
    public float precio;

//    Constructor
    public Silla(String nombre,String material,float precio){
//      Establece el nombre
        this.setNombre(nombre);
//      Establece el material
        this.setMaterial(material);
//      Establece el precio
        this.setPrecio(precio);
    }

//  Constructor con un parametro null
    public Silla(String nombre,String material){
//     Cuando hay un parametro null se debe de hacer en una linea
       this(nombre, material, 0);
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getMaterial(){
        return this.nombre;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
