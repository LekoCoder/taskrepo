package com.amil.spring.controller;

import com.amil.spring.domain.City;
import com.amil.spring.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @PostMapping("/save_city")
    public void saveCities() {
        City c1 = new City("Baku");
        City c2 = new City("Gabala");
        cityRepository.saveAll(Arrays.asList(c1, c2));
    }

    @DeleteMapping("/delete_city")
    public void deleteCities() {
        cityRepository.delete(new City("Gabala"));
    }

    @GetMapping("/get_city")
    public Iterable<City> getCities() {
        return cityRepository.findAll();
    }

}
