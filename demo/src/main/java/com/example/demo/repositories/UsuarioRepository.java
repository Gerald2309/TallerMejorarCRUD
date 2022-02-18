package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> { /*CrudRepository
    Es la clase que implementa los métodos findAll, save, y otros de la base de datos    */
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    public abstract ArrayList<UsuarioModel> findByEstratoSocial(Integer estratoSocial);
}