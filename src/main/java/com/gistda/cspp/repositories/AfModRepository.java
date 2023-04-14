package com.gistda.cspp.repositories;

import com.gistda.cspp.entities.AfMod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AfModRepository extends JpaRepository<AfMod , Long> {
    List<AfMod> findAllByDataDate(LocalDate dataDate) ;
    List<AfMod> findByLatitudeAndLongitude (Double latitude , Double longitude) ;
}
