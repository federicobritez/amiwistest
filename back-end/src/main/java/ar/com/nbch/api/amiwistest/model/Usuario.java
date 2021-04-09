package ar.com.nbch.api.amiwistest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String cbu;
    @Column(unique = true)
    private String email;
    private String password;
    private Float saldo;
    @OneToMany
    private Amigo amigos;
}
