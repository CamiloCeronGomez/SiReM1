package com.example.camilo.sirem.models;

/**
 * Created by camilo on 07/07/2017.
 */

public class Ejercicio implements Item {
    String imagen;
    String nombre;

    public Ejercicio(String imagen, String nombre, String descripcion, String serie, String descriocionS, String video) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.serie = serie;
        this.descriocionS = descriocionS;
        this.video = video;
    }

    String descripcion;
    String serie;
    String descriocionS;
    String video;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescriocionS() {
        return descriocionS;
    }

    public void setDescriocionS(String descriocionS) {
        this.descriocionS = descriocionS;
    }

    public String getVideo() {return video;}

    public void setVideo(String video) {this.video = video;}
    @Override
    public int getTipo() {
        return TIPO_UNO;
    }

}
