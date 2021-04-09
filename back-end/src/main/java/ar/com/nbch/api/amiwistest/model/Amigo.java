package ar.com.nbch.api.amiwistest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Amigo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Usuario amigo;
    private String apodo;
}
