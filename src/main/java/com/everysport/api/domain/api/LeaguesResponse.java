package com.everysport.api.domain.api;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with love.
 * Victor Lindell
 * 3/5/13 - 1:27 PM
 */
public class LeaguesResponse extends ApiListResponse
{

    private List<League> leagues = new LinkedList<League>();

    public LeaguesResponse() {
    }

    public LeaguesResponse(List<League> leagues) {
        this.leagues = leagues;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }
}
