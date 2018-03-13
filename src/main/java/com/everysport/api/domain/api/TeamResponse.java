package com.everysport.api.domain.api;

public class TeamResponse extends ApiBaseResponse
{
    private Team team;

    public TeamResponse() {
    }

    public TeamResponse(Team team) {
        setTeam(team);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
