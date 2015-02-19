package com.everysport.api.domain.api;

public class Scorer extends Player {
    private Integer goals;
    private Team team;

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}