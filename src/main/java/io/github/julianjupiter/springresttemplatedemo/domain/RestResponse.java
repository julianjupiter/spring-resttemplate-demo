package io.github.julianjupiter.springresttemplatedemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RestResponse {
    private List<String> messages;
    @JsonProperty("result")
    private List<Result> results;

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
