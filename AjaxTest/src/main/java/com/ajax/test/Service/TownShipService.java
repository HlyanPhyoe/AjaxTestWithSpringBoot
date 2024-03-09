package com.ajax.test.Service;

import com.ajax.test.Model.Township;
import com.ajax.test.Repository.TownshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownShipService {
    @Autowired
    private TownshipRepository repo;
   public List<Township> FindByTownshipCityId(int cityId){
        return repo.findTownshipByCity_Id(cityId);
    }
   public List<Township> getAllTownship(){
        return repo.findAll();
    }

}
