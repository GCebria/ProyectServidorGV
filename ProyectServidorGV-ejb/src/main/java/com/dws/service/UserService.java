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

    @EJB
    private static CancionServiceLocal cancionService;

    private static ArrayList<User> users = new ArrayList();
    private static ArrayList<Cancion> listaCanciones = cancionService.listCanciones();

    static {
        User u1 = new User("1", "user1", "user1@gmail.com", "pass", listaCanciones);
        User u2 = new User("2", "user2", "user2@gmail.com", "pass", null);
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
                user = u;
            }
        }
               
        return user;
    }
    
    

}
