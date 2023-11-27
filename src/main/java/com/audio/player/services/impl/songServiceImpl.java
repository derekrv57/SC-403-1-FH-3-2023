/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.services.impl;

/**
 *
 * @author derek
 */

import com.audio.player.dao.songDao;
import com.audio.player.domain.song;
import com.audio.player.services.songService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class songServiceImpl implements songService {

    @Autowired
    private songDao songDao;
    @Override
    @Transactional(readOnly=true)
    public List<song> getSongs() {
        var lista=songDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public song getSong(song song) {
        return songDao.findById(song.getIDCanción()).orElse(null);
    }

    @Override
    @Transactional
    public void save(song song) {
        songDao.save(song);
    }

    @Override
    @Transactional
    public void delete(song song) {
        songDao.delete(song);
    }

}