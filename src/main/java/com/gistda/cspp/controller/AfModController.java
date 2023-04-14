package com.gistda.cspp.controller;

import com.gistda.cspp.dto.AfModDTO;
import com.gistda.cspp.services.AfModService;
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
public class AfModController {
    public static final String AFMOD_PATH = "/api/v1/afmod" ;
    private final AfModService afModService ;

    @GetMapping(AFMOD_PATH)
    public List<AfModDTO> listAfMod(@RequestParam(required = false) Double latitude ,
                                    @RequestParam(required = false) Double longitude,
                                    @RequestParam(required = false) LocalDate dataDate ) {
        return afModService.listAfMod(latitude,longitude,dataDate);
    }
}
