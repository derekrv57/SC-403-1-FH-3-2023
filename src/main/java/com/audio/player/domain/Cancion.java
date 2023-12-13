/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.domain;

/**
 *
 * @author jorge
 */


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Cancion {

    @Id
    private Integer IDCanción;
    private String Nombre;
    private String Dir;

    @ManyToOne
    @JoinColumn(name = "IDÁlbum", nullable = false)
    private album album;

    @Id
    private int IDCancion;
    private String nombre; // Cambié a mayúscula
    private String dir;    // Cambié a mayúscula
    private int IDÁlbum;
    // Getters y setters
    public int getIDCancion() {
        return IDCancion;
    }

    public void setIDCancion(int IDCancion) {
        this.IDCancion = IDCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String Dir) {
        this.dir = Dir;
    }

    public int getIDÁlbum() {
        return IDÁlbum;
    }

    public void setIDÁlbum(int IDÁlbum) {
        this.IDÁlbum = IDÁlbum;
    }
}
