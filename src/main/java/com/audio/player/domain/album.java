/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author jorge
 */



@Entity
public class album {

    @Id
    private Integer IDÁlbum;
    private String Título;
    private Integer AñoLanzamiento;
    private Integer IDUsuario;
    private boolean Pública;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Cancion> canciones;


    public Integer getIDÁlbum() {
        return IDÁlbum;
    }

    public void setIDÁlbum(Integer IDÁlbum) {
        this.IDÁlbum = IDÁlbum;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public Integer getAñoLanzamiento() {
        return AñoLanzamiento;
    }

    public void setAñoLanzamiento(Integer AñoLanzamiento) {
        this.AñoLanzamiento = AñoLanzamiento;
    }

    public Integer getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(Integer IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public boolean isPública() {
        return Pública;
    }

    public void setPública(boolean Pública) {
        this.Pública = Pública;
    }
        public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
}
