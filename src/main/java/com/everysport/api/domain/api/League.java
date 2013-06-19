package com.everysport.api.domain.api;

/**
 * Created by Fredrik, 2013-03-13 3:00 PM
 */

public class League extends ApiIdEntity {

    private String name;

    private Sport sport;
    private TeamClass teamClass;

    public TeamClass getTeamClass() {
        return teamClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void setTeamClass(TeamClass teamClass) {
        this.teamClass = teamClass;
    }
}
