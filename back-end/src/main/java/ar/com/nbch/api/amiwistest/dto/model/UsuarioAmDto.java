package ar.com.nbch.api.amiwistest.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioAmDto {
    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("cbu")
    private String cbu;
}
