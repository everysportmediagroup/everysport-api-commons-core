package com.everysport.api.domain.api;

public class Team extends ApiNamedEntity {
    private String shortName;
    private String abbreviation;
    private String articleName;
    private String articleShortName;
    private String link;
    private String logo;
    private Sport sport;
    private TeamClass teamClass;
    private Integer teamClassId;
    private Arena arena;
    private Municipality municipality;
    private Boolean facts;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public TeamClass getTeamClass() {
        return teamClass;
    }

    public void setTeamClass(TeamClass teamClass) {
        this.teamClass = teamClass;
    }

    public Integer getTeamClassId() {
        return teamClassId;
    }

    public void setTeamClassId(Integer teamClassId) {
        this.teamClassId = teamClassId;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleShortName() {
        return articleShortName;
    }

    public void setArticleShortName(String articleShortName) {
        this.articleShortName = articleShortName;
    }

    public Boolean getFacts() {
        return facts;
    }

    public void setFacts(Boolean facts) {
        this.facts = facts;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }
}