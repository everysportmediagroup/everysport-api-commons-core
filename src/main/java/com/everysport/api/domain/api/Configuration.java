package com.everysport.api.domain.api;

public class Configuration extends ApiBaseEntity {
    private String language;
    private Boolean homeTeamLast;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHomeTeamLast() {
        return homeTeamLast;
    }

    public void setHomeTeamLast(Boolean homeTeamLast) {
        this.homeTeamLast = homeTeamLast;
    }
}