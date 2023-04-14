package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfImgDTO;
import com.gistda.cspp.entities.AfImg;
import com.gistda.cspp.mappers.AfImgMapper;
import com.gistda.cspp.repositories.AfImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AfImgServiceImpl implements AfImgService {
    private final AfImgRepository afImgRepository;
    private final AfImgMapper afImgMapper;

    @Override
    public List<AfImgDTO> listAfImg(Double latitude , Double longitude , LocalDate dataDate) {
        List<AfImg> afImgList;

        if((latitude != null && longitude != null) && dataDate == null) {
            afImgList = afImgRepository.findByLatitudeAndLongitude(latitude,longitude) ;
        } else if ((latitude == null && longitude == null) && dataDate != null) {
            afImgList = afImgRepository.findAllByDataDate(dataDate) ;
        } else {
            afImgList = afImgRepository.findAll();
        }
        return afImgList.stream()
                .map(afImgMapper::afImgTOAfImgDTO)
                .collect(Collectors.toList());
    }

}
