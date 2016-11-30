/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dws.service;

import com.dws.domain.User;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class UserService implements UserServiceLocal {

    private static ArrayList<User> users = new ArrayList();

    static {
        User admin = new User("1", "admin", "admin@gmail.com", "admin");
        User u1 = new User("2", "user1", "user1@gmail.com", "pass");
        User u2 = new User("3", "user2", "user2@gmail.com", "pass");
        users.add(admin);
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
    public User comprobacionUsuario(String usuario, String password) {
        User usuarioConectado = null;

        for (User u : users) {
            if ("admin".equalsIgnoreCase(usuario) && u.getPassword().equalsIgnoreCase(usuario)) {
                usuarioConectado = u;
            if (u.getNombre().equalsIgnoreCase(usuario) && u.getPassword().equalsIgnoreCase(usuario)) {
                usuarioConectado = u;
            } else {
                usuarioConectado = null;
            }
        }
        
        return usuarioConectado;
    }

}
