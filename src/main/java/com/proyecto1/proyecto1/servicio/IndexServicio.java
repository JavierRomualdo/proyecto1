/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1.proyecto1.servicio;

import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class IndexServicio implements IIndexIServicio {
    
    //implementacion de otra clase el override
    @Override
    public String devolverMensaje() {
        return "Bienvenido";
    }
    
}
