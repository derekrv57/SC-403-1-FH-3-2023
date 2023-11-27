/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.dao;

import com.audio.player.domain.song;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author derek
 */
public interface songDao extends JpaRepository<song, Long> {

}
