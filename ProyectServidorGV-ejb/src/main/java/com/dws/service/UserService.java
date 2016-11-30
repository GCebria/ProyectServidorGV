/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.service;

import com.dws.domain.Cancion;
import com.dws.domain.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UserService implements UserServiceLocal {

   private static ArrayList<User> users = new ArrayList();
    
    static {
    
        ArrayList<Cancion> biblioteca1 = new ArrayList();
        ArrayList<Cancion> biblioteca2 = new ArrayList();
        String album = "Hot Fuss";
        String artista = "The Killers";
        int ano = 2014;
        double precio = 0.99;
        Cancion c1 = new Cancion(1, "Jenny Was a Friend of Mine", album, artista, 244, ano, precio);
        Cancion c2 = new Cancion(2, "Mr.Brightside", album, artista, 222, ano, precio);
        Cancion c3 = new Cancion(3, "Smile Like You Mean It", album, artista, 234, ano, precio);
        Cancion c4 = new Cancion(4, "Somebody Told Me", album, artista, 197, ano, precio);

        biblioteca1.add(c1);
        biblioteca1.add(c2);
        biblioteca1.add(c3);
        biblioteca1.add(c4);

        Cancion c7 = new Cancion(7, "On Top", album, artista, 258, ano, precio);
        Cancion c8 = new Cancion(8, "Change Your Mind", album, artista, 190, ano, precio);
        Cancion c9 = new Cancion(9, "Believe Me Natalie", album, artista, 306, ano, precio);
        Cancion c10 = new Cancion(10, "Midnight Show", album, artista, 242, ano, precio);
        Cancion c11 = new Cancion(11, "Everything Will Be Alright", album, artista, 345, ano, precio);

        biblioteca2.add(c7);
        biblioteca2.add(c9);
        biblioteca2.add(c8);
        biblioteca2.add(c10);
        biblioteca2.add(c11);
        
         User u1 = new User("1", "user1", "user1@gmail.com", "pass", biblioteca1);
        User u2 = new User("2", "user2", "user2@gmail.com", "pass", biblioteca2);
        users.add(u1);
        users.add(u2);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public ArrayList listUsers() {
        return users;
    }

    @Override
    public User buscaUser(String id) {
        ArrayList<User> listaUsuarios = this.listUsers();
        User user = null;
        for (User u: listaUsuarios){
            if(id.equals(u.getIdUser())){
                user.setIdUser(id);
                user.setNombre(u.getNombre());
                user.setEmail(u.getEmail());
                user.setPassword(u.getPassword());
                user.setBiblioteca(u.getBiblioteca());
            }
        }
               
        return user;
    }
    
    

}
