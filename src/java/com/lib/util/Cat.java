/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lib.util;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author hidro
 */
@ManagedBean
@Named(value = "cat")
public class Cat {
    private String id,nom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
