package com.kb.KBArt51.service;

import com.kb.KBArt51.entity.Country;
import com.kb.KBArt51.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> fetchCountryList() {
        return countryRepository.findAll();
    }
}
