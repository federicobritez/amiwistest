package ar.com.nbch.api.amiwistest.dto.mapper;

import ar.com.nbch.api.amiwistest.dto.model.AmigoDto;
import ar.com.nbch.api.amiwistest.dto.model.UsuarioAmDto;
import ar.com.nbch.api.amiwistest.dto.model.UsuarioGetDto;
import ar.com.nbch.api.amiwistest.dto.model.UsuarioPostDto;
import ar.com.nbch.api.amiwistest.model.Amigo;
import ar.com.nbch.api.amiwistest.model.Usuario;

@org.mapstruct.Mapper(componentModel = "spring")
public interface MapStructMapper {
    UsuarioGetDto usuarioToGetDto(Usuario usuario);
    UsuarioPostDto usuarioToPostDto(Usuario usuario);
    UsuarioAmDto usuarioToAmDto(Usuario usuario);
    Usuario postDtoToUsuario(UsuarioPostDto usuarioPostDto);
    Usuario getDtoToUsuario(UsuarioGetDto usuarioGetDto);
    AmigoDto amigoToAmigoDto (Amigo amigo);
    Amigo amigoDtoToAmigo (AmigoDto amigoDto);
}
