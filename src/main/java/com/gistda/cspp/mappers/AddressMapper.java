package com.gistda.cspp.mappers;

import com.gistda.cspp.dto.AddressDTO;
import com.gistda.cspp.entities.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    Address addressDTOToAddress (AddressDTO dto) ;
    AddressDTO addressTOAddressDTO (Address address) ;
}
