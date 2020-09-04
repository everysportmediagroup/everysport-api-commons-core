package com.everysport.api.domain.api;

public class EventStatisticsType extends ApiBaseEntity {
    private Integer homeTeam;
    private Integer visitingTeam;

    public Integer getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Integer homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Integer getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(Integer visitingTeam) {
        this.visitingTeam = visitingTeam;
    }
}