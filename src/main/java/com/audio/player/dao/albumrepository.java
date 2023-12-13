/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.dao;

/**
 *
 * @author jorge
 */
import com.audio.player.domain.album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface albumrepository extends JpaRepository<album, Integer> {

}

