package com.everysport.api.domain.api;

public class Configuration extends ApiBaseEntity {
    private String lang;
    private Boolean homeTeamLast;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getHomeTeamLast() {
        return homeTeamLast;
    }

    public void setHomeTeamLast(Boolean homeTeamLast) {
        this.homeTeamLast = homeTeamLast;
    }
}