package com.gistda.cspp.services;

import com.gistda.cspp.dto.AddressDTO;
import com.gistda.cspp.entities.Address;
import com.gistda.cspp.mappers.AddressMapper;
import com.gistda.cspp.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository ;
    private final AddressMapper addressMapper ;
    @Override
    public List<AddressDTO> listAddress() {
        List<Address> addressList ;

        addressList = addressRepository.findAll() ;

        return addressList.stream().map(addressMapper::addressTOAddressDTO).collect(Collectors.toList());
    }

}
