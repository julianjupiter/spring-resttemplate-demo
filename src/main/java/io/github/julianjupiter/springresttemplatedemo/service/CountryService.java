package io.github.julianjupiter.springresttemplatedemo.service;

import io.github.julianjupiter.springresttemplatedemo.domain.Result;

import java.util.List;

public interface CountryService {
    List<Result> getCountries();
}
