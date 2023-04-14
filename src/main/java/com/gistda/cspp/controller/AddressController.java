package com.gistda.cspp.controller;

import com.gistda.cspp.dto.AddressDTO;
import com.gistda.cspp.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class AddressController {
    public static final String ADDRESS_PATH = "/api/v1/address" ;
    private final AddressService addressService ;

    @GetMapping(ADDRESS_PATH)
    public List<AddressDTO> listAddress() {
        return addressService.listAddress();
    }
}
