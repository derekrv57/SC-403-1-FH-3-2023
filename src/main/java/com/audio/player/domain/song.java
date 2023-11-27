/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
*
* @author derek
*/
@Data
@Entity
@Table(name = "Canción")
public class song implements Serializable{

    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCanción")
    private Long IDCanción;
    private String Nombre;
    private String Dir;
    private int IDÁlbum;

    public song(Long IDCanción, String Nombre, String Dir, int IDÁlbum) {
        this.IDCanción = IDCanción;
        this.Nombre = Nombre;
        this.Dir = Dir;
        this.IDÁlbum = IDÁlbum;
    }

    public song() {
    }

    
        
}
