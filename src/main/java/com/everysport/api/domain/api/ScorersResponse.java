package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class ScorersResponse extends ApiListResponse
{
    private List<Scorer> scorers = new LinkedList<>();

    public ScorersResponse() {
    }

    public ScorersResponse(List<Scorer> scorers) {
        this.scorers = scorers;
    }

    public List<Scorer> getScorers() {
        return scorers;
    }

    public void setScorers(List<Scorer> scorers) {
        this.scorers = scorers;
    }
}