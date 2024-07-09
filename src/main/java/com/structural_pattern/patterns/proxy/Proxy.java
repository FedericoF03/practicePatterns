package com.structural_pattern.patterns.proxy;
//Proxy es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador
// de posición para otro objeto. Un proxy controla el acceso al objeto original,
// permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.
public class Proxy {
    public void run() {
        //Se invoca el proxy y dentro del mismo el servicio a cumplirm se hace la llamada del proxy que tiene metodo que reacciona al server
        new ServerCache(new ServerImpl()).accesCache();
    }
}
