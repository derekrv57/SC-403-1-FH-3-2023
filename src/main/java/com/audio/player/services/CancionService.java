/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.services;

/**
 *
 * @author jorge
 */
import com.audio.player.dao.CancionRepository;
import com.audio.player.domain.Cancion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;

    public List<Cancion> buscarPorNombre(String nombre) {
        return cancionRepository.findByNombreContaining(nombre);
    }
}

