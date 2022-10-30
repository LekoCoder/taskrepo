package com.amil.spring.controller;

import com.amil.spring.domain.City;
import com.amil.spring.domain.Country;
import com.amil.spring.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @PostMapping("/save_country")
    public void saveCountries() {
        Country c1 = new Country("Azerbaijan");
        Country c2 = new Country("Azerbaijan");
        countryRepository.saveAll(Arrays.asList(c1, c2));
    }

    @DeleteMapping(value="/delete_country")
    public void deleteCountries() {
        countryRepository.delete(new Country("Azerbaijan"));
    }

    @GetMapping("/get_country")
    public Iterable<Country> getCountries() {
        return countryRepository.findAll();
    }
}
