package com.everysport.api.domain.api;

public class PlayerStats extends Player {
    private Integer count;
    private Team team;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}