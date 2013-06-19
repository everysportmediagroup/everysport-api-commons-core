package com.everysport.api.domain.api;

public class LeagueResponse extends ApiBaseResponse
{

    private League league;

    public LeagueResponse() {
    }

    public LeagueResponse(League league) {
        setLeague(league);
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
