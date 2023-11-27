/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.services;

import com.audio.player.domain.song;
import java.util.List;

/**
 *
 * @author derek
 */
public interface songService {
    public List<song> getSongs();
    
    // Se obtiene un song, a partir del id de un categoria
    public song getSong(song song);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(song song);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(song song);
}
