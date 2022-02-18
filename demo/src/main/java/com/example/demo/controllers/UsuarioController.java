/*Flujo del programa:
Aquí se recibe la petición - manda a llamar un servicio (donde está la lógica de la
aplicación y este usa el repositorio que es donde realmente se hace la conexion con la DB
y el repositorio utiliza el modelo para saber el tipo de información que trae*/
package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario") //La dirección en la que se van a usar los métodos de esta clase
public class UsuarioController {
    @Autowired //Instancia automáticamente
    UsuarioService usuarioService;

    @GetMapping() //Indica que se debe ejecutar este flujo cuando haya una petición de tipo get
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping() //Devuelve usuario actualizado
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }


}