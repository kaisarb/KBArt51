package com.kb.KBArt51.controller;

import com.kb.KBArt51.entity.Country;
import com.kb.KBArt51.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String HelloSpring() {
        return "Hello Spring";
    }

    @GetMapping("/countries")
    public List<Country> fetchCOuntryList() {
        return countryService.fetchCountryList();
    }

}
