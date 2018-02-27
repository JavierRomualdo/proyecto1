/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1.proyecto1.controller;

import com.proyecto1.proyecto1.dao.IPersonaDao;
import com.proyecto1.proyecto1.entidades.Persona;
import com.proyecto1.proyecto1.servicio.IIndexIServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javie
 */
@RestController
@RequestMapping("index")
public class IndexController {
    
    //cree el entorno para ese servico da keese objeto exista
    @Autowired
    IIndexIServicio indexServicio;
    
    @Autowired
    IPersonaDao personadao;
    
    @GetMapping("mensaje")
    public String mensaje() {
        String mensajeServicio = indexServicio.devolverMensaje();
        return mensajeServicio+" Javier Romualdo ";
    }
    
    @GetMapping("mario")
    public String mirar(){
        return "mario es gay";
    }
    
    @GetMapping("persona")
    public Persona getPersona(){
        return personadao.findOne(new Long(1));
    }
    
    
    
    @GetMapping("arreglo")
    public String[] hola(){
        String a[] = {"1","2"};
        return a;
    }
}
