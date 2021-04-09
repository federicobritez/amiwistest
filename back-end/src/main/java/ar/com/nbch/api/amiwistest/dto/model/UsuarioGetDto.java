package ar.com.nbch.api.amiwistest.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class UsuarioGetDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("email")
    private String email;

    @JsonProperty("cbu")
    private String cbu;

    @JsonProperty("saldo")
    private Float saldo;

    @JsonProperty("amigos")
    private Set<AmigoDto> amigos;
}
