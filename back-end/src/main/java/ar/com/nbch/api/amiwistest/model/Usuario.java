package ar.com.nbch.api.amiwistest.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true) // TODO: Hace que genere automaticamente. por ahora es el default
    private String cbu;
    @Column(unique = true)
    private String email;
    private String password;
    private Float saldo;
    @OneToMany
    private Set<Amigo> amigos = new HashSet<>();
}
