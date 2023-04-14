package com.gistda.cspp.controller;

import com.gistda.cspp.dto.AfImgDTO;
import com.gistda.cspp.services.AfImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class AfImgController {
    public static final String AFIMG_PATH = "/api/v1/afimg" ;
    private final AfImgService afImgService ;

    @GetMapping(AFIMG_PATH)
    public List<AfImgDTO> listAfImg(@RequestParam(required = false) Double latitude ,
                                    @RequestParam(required = false) Double longitude,
                                    @RequestParam(required = false) LocalDate dataDate)  {
        return afImgService.listAfImg(latitude,longitude,dataDate);
    }

}
