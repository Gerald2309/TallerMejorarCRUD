package com.example.demo.models;

import javax.persistence.*; //importa todas las anotaciones de JPA

@Entity
@Table(name = "usuario") //Nombre de la tabla, si no se pone queda por defecto el nombre de la clase
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se genera y aumenta automáticamente
    @Column(unique = true, nullable = false) //NOT NULL
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    private Integer estratoSocial;


   public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(Integer estratoSocial) {
        this.estratoSocial = estratoSocial;
    }
}
