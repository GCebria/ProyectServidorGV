/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idCancion;
    private String nombre;
    private String album;
    private String artista;
    private int ano;
    private int duracion;
    private Double precio; 

    public Cancion(int idCancion, String nombre, String album, String artista, int duracion, int ano, Double precio) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
        this.ano = ano;
        this.precio = precio;
        
    }

    public Cancion() {
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idCancion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return true;
    }

    

    @Override
    public String toString() {
        return "Cancion{" + "idCancion=" + idCancion + ", nombre=" + nombre + ", album=" + album + ", artista=" + artista + ", ano=" + ano + ", duracion=" + duracion + ", precio=" + precio + '}';
    }

    
    
    
    
}
