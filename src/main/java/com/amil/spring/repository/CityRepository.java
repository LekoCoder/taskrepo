package com.amil.spring.repository;

import com.amil.spring.domain.City;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface CityRepository extends CrudRepository<City, Long> {
}
