package ar.com.nbch.api.amiwistest.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioAmDTo {
    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("cbu")
    private String cbu;
}
