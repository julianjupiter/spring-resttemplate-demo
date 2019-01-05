package io.github.julianjupiter.springresttemplatedemo.controller;

import io.github.julianjupiter.springresttemplatedemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public String getAllCountries(Model model) {
        model.addAttribute("countries", countryService.getCountries());

        return "country/list";
    }
}
