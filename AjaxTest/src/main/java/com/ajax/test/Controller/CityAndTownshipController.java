package com.ajax.test.Controller;

import com.ajax.test.Model.City;
import com.ajax.test.Model.Township;
import com.ajax.test.Service.CityService;
import com.ajax.test.Service.TownShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Component
@Controller
public class CityAndTownshipController {
    @Autowired
    private CityService cityService;
    @Autowired
    private TownShipService townShipService;
    @GetMapping("/")
    public ModelAndView cityAddForm(ModelMap model){
        int maxId = cityService.getCityMaxId();
        model.addAttribute("MaxId",maxId+1);
        return new ModelAndView("cityadd","city",new City());
    }
    @PostMapping("/city-add")
    public String cityAdd(@ModelAttribute("city") City city){

        cityService.cityAdd(city);
        return "redirect:/";
    }
    @GetMapping("/register-form")
    public String registerForm(ModelMap model){
        List<City> cityList = cityService.getAllCity();
        model.addAttribute("CityList",cityList);
        List<Township> townshipList = townShipService.getAllTownship();
        model.addAttribute("TownShip",townshipList);
        return "registration";
    }
}
