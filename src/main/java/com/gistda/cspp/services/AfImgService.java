package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfImgDTO;

import java.time.LocalDate;
import java.util.List;

public interface AfImgService {
    List<AfImgDTO> listAfImg(Double latitude , Double longitude , LocalDate dataDate) ;

}
