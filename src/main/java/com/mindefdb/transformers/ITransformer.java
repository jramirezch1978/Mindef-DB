package com.mindefdb.transformers;

import java.util.List;

import com.mindefdb.dominio.ancestors.IModelEntity;
import com.mindefdb.dominio.model.Unidad;
import com.mindefdb.dtos.UnidadDTO;
import com.mindefdb.dtos.ancestors.AncestorDTO;

public interface ITransformer {
	public IModelEntity parserDtoToModel(AncestorDTO dto);
	public AncestorDTO parserModelToDto(IModelEntity model);
	public List<AncestorDTO> parserModelToDTO(List<IModelEntity> lista);
	
}
