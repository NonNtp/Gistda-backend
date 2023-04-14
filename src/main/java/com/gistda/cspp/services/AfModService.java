package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfModDTO;

import java.time.LocalDate;
import java.util.List;

public interface AfModService {
    List<AfModDTO> listAfMod(Double latitude , Double longitude , LocalDate dataDate) ;
}
