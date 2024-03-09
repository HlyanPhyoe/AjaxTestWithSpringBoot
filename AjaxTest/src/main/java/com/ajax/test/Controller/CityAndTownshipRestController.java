package com.ajax.test.Controller;

import com.ajax.test.Model.Township;
import com.ajax.test.Service.TownShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityAndTownshipRestController {
    @Autowired
    private TownShipService townShipService;
    @GetMapping(value = "/get-townshipsById",produces = "application/json")
    public ResponseEntity<List<Township>> getTownshipByCity(@RequestParam int selectedValue){
        System.out.println("Selected Value = "+selectedValue);
        List<Township> townships = townShipService.FindByTownshipCityId(selectedValue);
        System.out.println("TownShips : "+townships);
        return ResponseEntity.ok(townships);
    }
}
