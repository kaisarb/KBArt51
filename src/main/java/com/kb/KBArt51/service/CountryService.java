package com.kb.KBArt51.service;

import com.kb.KBArt51.entity.Country;
import com.kb.KBArt51.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CountryService {

    public List<Country> fetchCountryList();

}
