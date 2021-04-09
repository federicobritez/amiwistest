package ar.com.nbch.api.amiwistest.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

public class UsuarioPostDto {
    @JsonProperty("nombre")
    @NotNull
    private String nombre;

    @JsonProperty("email")
    @NotNull
    private String email;

    @JsonProperty("password")
    @NotNull
    private String password;

    @JsonProperty("cbu")
    private String cbu;
}
