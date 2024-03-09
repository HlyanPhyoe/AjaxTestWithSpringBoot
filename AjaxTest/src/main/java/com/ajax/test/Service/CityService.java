package com.ajax.test.Service;

import com.ajax.test.Model.City;
import com.ajax.test.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository repo;
    public City cityAdd(City city){
        city.setId(city.getId());
        city.setName(city.getName());
        return repo.save(city);
    }
    public int getCityMaxId(){
        return repo.getTopByOrderByIdDesc().map(City::getId).orElse(0);
    }
    public List<City> getAllCity(){
        return repo.findAll();
    }

}
