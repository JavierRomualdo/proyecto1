/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1.proyecto1.dao;

import com.proyecto1.proyecto1.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javie
 */
public interface IPersonaDao extends JpaRepository<Persona, Long> {
    
}
