package com.vicky.springbootdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HolaController {
    @GetMapping
    public final String hola() throws UnknownHostException {
        return "Hola! Puedes encontrarme en " + InetAddress.getLocalHost().getHostAddress();
    }

}
