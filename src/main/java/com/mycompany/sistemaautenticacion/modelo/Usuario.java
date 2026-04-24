/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautenticacion.modelo;

/**
 *
 * @author jeimy
 */
public class Usuario {
   
    private String username;
    private String password;
    private boolean activo;

    public Usuario(String username, String password, boolean activo) {
        this.username = username;
        this.password = password;
        this.activo = activo;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean isActivo() { return activo; }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
   
