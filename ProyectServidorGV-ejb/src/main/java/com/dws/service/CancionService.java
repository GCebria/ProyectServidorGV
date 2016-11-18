/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.service;

import com.dws.domain.Cancion;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author alumno
 */
@Stateless
public class CancionService implements CancionServiceLocal {

    private static ArrayList<Cancion> canciones = new ArrayList();

    static {
        String album = "Hot Fuss";
        String artista = "The Killers";
        int ano = 2014;
        double precio = 0.99;
        Cancion c1 = new Cancion(1, "Jenny Was a Friend of Mine", album, artista, 244, ano, precio);
        Cancion c2 = new Cancion(2, "Mr.Brightside", album, artista, 222, ano, precio);
        Cancion c3 = new Cancion(3, "Smile Like You Mean It", album, artista, 234, ano, precio);
        Cancion c4 = new Cancion(4, "Somebody Told Me", album, artista, 197, ano, precio);
        Cancion c5 = new Cancion(5, "All These Things That I've Done", album, artista, 301, ano, 1.5);
        Cancion c6 = new Cancion(6, "Andy, You're a Star", album, artista, 194, ano, precio);
        Cancion c7 = new Cancion(7, "On Top", album, artista, 258, ano, precio);
        Cancion c8 = new Cancion(8, "Change Your Mind", album, artista, 190, ano, precio);
        Cancion c9 = new Cancion(9, "Believe Me Natalie", album, artista, 306, ano, precio);
        Cancion c10 = new Cancion(10, "Midnight Show", album, artista, 242, ano, precio);
        Cancion c11 = new Cancion(11, "Everything Will Be Alright", album, artista, 345, ano, precio);

        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);
        canciones.add(c6);
        canciones.add(c7);
        canciones.add(c8);
        canciones.add(c9);
        canciones.add(c10);
        canciones.add(c11);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
//      public Cancion(String idCancion, String nombre, String album, String artista, int duracion, int ano)

    @Override
    public ArrayList listCanciones() {
        return canciones;
    }

    @Override
    public ArrayList deleteCancion(int id) {
//        ArrayList<Cancion> aux = null;
        int indice = 0;
        for (Cancion c : canciones) {
            if (c.getIdCancion() == id) {
                indice = canciones.indexOf(c);
                canciones.remove(indice);
//                aux.add(c);
            }      
        }
        return canciones;
    }

    @Override
    public Boolean eliminaCancion(Cancion c) {
        boolean encontrado = false;
        int i = 0;

        while ((i < canciones.size()) && (encontrado == false)) {
            if (canciones.get(i).getIdCancion()== c.getIdCancion()) {
                encontrado = true;
            } else {
                i++;
            }
        }
        // Si la persona existe, tenemos el indice borrar
        if (encontrado == true) {
            canciones.remove(i);
        }
        return encontrado;
    }
    
    
}
