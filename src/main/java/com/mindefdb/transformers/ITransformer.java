package com.mindefdb.transformers;

import java.util.List;
import java.util.stream.Collectors;

import com.mindefdb.dominio.ancestors.IModelEntity;
import com.mindefdb.dtos.ancestors.AncestorDTO;

public interface ITransformer {
	public IModelEntity parserDtoToModel(AncestorDTO dto);
	public AncestorDTO parserModelToDto(IModelEntity model);
	
	// Método default que todas las implementaciones heredarán
    default List<AncestorDTO> parserModelToDTO(List<IModelEntity> lista) {
        return lista.stream()
                   .map(model -> parserModelToDto(model))
                   .collect(Collectors.toList());
    }
	
}
