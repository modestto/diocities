package com.github.modestto.diocities;


import com.github.modestto.diocities.countries.Country;
import com.github.modestto.diocities.countryrepository.CountryRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/countries")
public class CountryResource {
    
    
    private CountryRepository repository;
    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }
    
    
    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

 /*    @GetMapping("/{id}")  --Para busca simples por id sem indicações de erro
    public Country getone(@PathVariable Long id) {
        java.util.Optional<Country> optional = repository.findById(id);
        return optional.get();
        
    } */
    
    @GetMapping("/{id}")
    public ResponseEntity getone(@PathVariable Long id) {
        java.util.Optional<Country> optional = repository.findById(id);
        
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
        
        
    }
}
