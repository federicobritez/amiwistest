package ar.com.nbch.api.amiwistest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "cbu")
    private Usuario origen;
    @OneToOne
    @JoinColumn(name = "cbu")
    private Usuario destino;
    private Float monto;
}
