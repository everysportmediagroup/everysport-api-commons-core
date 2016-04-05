package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class TeamsResponse extends ApiListResponse {
    private List<Team> teams = new LinkedList<>();

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}