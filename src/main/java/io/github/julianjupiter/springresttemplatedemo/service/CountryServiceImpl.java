package io.github.julianjupiter.springresttemplatedemo.service;

import io.github.julianjupiter.springresttemplatedemo.domain.Response;
import io.github.julianjupiter.springresttemplatedemo.domain.RestResponse;
import io.github.julianjupiter.springresttemplatedemo.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Result> getCountries() {
        String url = "http://services.groupkt.com/country/get/all";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<Response> responseResponseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Response.class);
        Response response = responseResponseEntity.getBody();
        RestResponse restResponse = response != null ? response.getRestResponse() : null;

        return restResponse != null ? restResponse.getResults() : Collections.emptyList();
    }
}
