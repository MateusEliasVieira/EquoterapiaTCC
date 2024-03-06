package com.equoterapia.api.mapper;

import com.equoterapia.api.dto.usuario.UsuarioInputDTO;
import com.equoterapia.domain.model.usuario.Usuario;
import org.modelmapper.ModelMapper;

public class UsuarioMapper {

    public static Usuario converterUsuarioInputDTOEmUsuario(UsuarioInputDTO usuarioInputDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(usuarioInputDTO, Usuario.class);
    }
}
