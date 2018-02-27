/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1.proyecto1.controller;

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

    @GetMapping("mensaje")
    public String mensaje() {
        return "Javier Romualdo";
    }
    
    @GetMapping("mario")
    public String mirar(){
        return "mario es gay";
    }
    
    @GetMapping("arreglo")
    public String[] hola(){
        String a[] = {"1","2"};
        return a;
    }
}
