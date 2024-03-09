package com.ajax.test.Repository;

import com.ajax.test.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City,Integer> {
    Optional<City> getTopByOrderByIdDesc();
}
