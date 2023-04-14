package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfModDTO;
import com.gistda.cspp.entities.AfMod;
import com.gistda.cspp.mappers.AfModMapper;
import com.gistda.cspp.repositories.AfModRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AfModServiceImpl implements AfModService {
    private final AfModRepository afModRepository;
    private final AfModMapper afModMapper;

    @Override
    public List<AfModDTO> listAfMod(Double latitude , Double longitude ,LocalDate dataDate) {
        List<AfMod> afModList ;

        if((latitude != null && longitude != null) && dataDate == null) {
            afModList = afModRepository.findByLatitudeAndLongitude(latitude,longitude) ;
        } else if ((latitude == null && longitude == null) && dataDate != null) {
            afModList = afModRepository.findAllByDataDate(dataDate) ;
        } else {
            afModList = afModRepository.findAll();
        }
        return afModList.stream()
                .map(afModMapper::afModTOAfModDTO)
                .collect(Collectors.toList());
    }
}
