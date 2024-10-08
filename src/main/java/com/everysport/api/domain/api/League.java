package com.everysport.api.domain.api;

import java.util.Date;
import java.util.List;

/**
 * Created by Fredrik, 2013-03-13 3:00 PM
 */

public class League extends ApiNamedEntity {

    /* Used by Reflection in ResourceLinkUtils */
    public static final String RESOURCE_PATH = "/leagues";

    private Integer immutableId;
    private String level;
    private Long levelId;

    private Sport sport;
    private Category category;
    private TeamClass teamClass;
    private Integer teamClassId;

    private Date startDate;
    private Date endDate;

    private Season season;
    private List<Group> groups;
    private List<SubLeague> subLeagues;
    private List<Team> teams;	

    private Boolean liveScore;
    private String years;
    private Boolean standings;
    private Boolean hasSubLeagues;

    public Integer getImmutableId() {
        return immutableId;
    }

    public void setImmutableId(Integer immutableId) {
        this.immutableId = immutableId;
    }

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

    public Long getLevelId()
    {
        return levelId;
    }

    public void setLevelId(Long levelId)
    {
        this.levelId = levelId;
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

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<SubLeague> getSubLeagues() {
        return subLeagues;
    }

    public void setSubLeagues(List<SubLeague> subLeagues) {
        this.subLeagues = subLeagues;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }	

    public Boolean getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(Boolean liveScore) {
        this.liveScore = liveScore;
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public void setYears(String years) {
        this.years = years;
    }

    public String getYears() {
        return years;
    }

    public void setTeamClassId(Integer teamClassId)
    {
        this.teamClassId = teamClassId;
    }

    public Integer getTeamClassId()
    {
        return teamClassId;
    }

    public Boolean getStandings() {
        return standings;
    }

    public void setStandings(Boolean standings) {
        this.standings = standings;
    }

    public Boolean getHasSubLeagues() {
        return hasSubLeagues;
    }

    public void setHasSubLeagues(Boolean hasSubLeagues) {
        this.hasSubLeagues = hasSubLeagues;
    }
}
