package com.gistda.cspp.mappers;

import com.gistda.cspp.dto.AfModDTO;
import com.gistda.cspp.entities.AfMod;
import org.mapstruct.Mapper;

@Mapper
public interface AfModMapper {
    AfMod afModDTOToAfMod (AfModDTO dto) ;
    AfModDTO afModTOAfModDTO (AfMod afMod) ;
}
