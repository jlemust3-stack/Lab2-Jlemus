/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautenticacion.logica;

/**
 *
 * @author jeimy
 */
import com.mycompany.sistemaautenticacion.modelo.Usuario;
import java.util.ArrayList;

public class UsuarioDAO {

    public static ArrayList<Usuario> lista = new ArrayList<Usuario>();

    static {
        lista.add(new Usuario("jlemus", "Morci10.", true));
    }

    public static Usuario validar(String user, String pass) {
        for (Usuario u : lista) {
            if (u.getUsername().equals(user) &&
                u.getPassword().equals(pass) &&
                u.isActivo()) {
                return u;
            }
        }
        return null;
    }
}