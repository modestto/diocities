package com.github.modestto.diocities.countryrepository;

import com.github.modestto.diocities.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long>{
    
}
