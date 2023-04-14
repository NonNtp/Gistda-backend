package com.gistda.cspp.mappers;

import com.gistda.cspp.dto.AfImgDTO;
import com.gistda.cspp.entities.AfImg;
import org.mapstruct.Mapper;
@Mapper
public interface AfImgMapper {
    AfImg afImgDTOToAfImg (AfImgDTO dto) ;
    AfImgDTO afImgTOAfImgDTO (AfImg afImg) ;
}
