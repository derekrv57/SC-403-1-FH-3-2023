/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.services;

/**
 *
 * @author jorge
 */
import com.audio.player.dao.albumrepository;
import com.audio.player.domain.Cancion;
import com.audio.player.domain.album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class albumservice {

    @Autowired
    private albumrepository albumRepository;

    public Optional<album> getAlbumById(Integer id) {
        return albumRepository.findById(id);
    }

    public List<Cancion> getCancionesByAlbumId(Integer albumId) {
        Optional<album> albumOptional = albumRepository.findById(albumId);
        return albumOptional.map(album::getCanciones).orElse(null);
    }
}


