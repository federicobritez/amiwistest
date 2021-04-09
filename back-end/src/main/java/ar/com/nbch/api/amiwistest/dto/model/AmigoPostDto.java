package ar.com.nbch.api.amiwistest.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AmigoPostDto {
    @JsonProperty("apodo")
    private String apodo;

    @JsonProperty("email")
    private String email;
}
