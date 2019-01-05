package io.github.julianjupiter.springresttemplatedemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }
}
