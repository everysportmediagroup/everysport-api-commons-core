package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

public class StandingsTrend extends ApiBaseEntity {
    private Team team;

    private List<TeamStats> stats = new LinkedList<TeamStats>();

    private List<Result> results = new LinkedList<Result>();

    public List<TeamStats> getStats() {
        return stats;
    }

    public void setStats(List<TeamStats> stats) {
        this.stats = stats;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
